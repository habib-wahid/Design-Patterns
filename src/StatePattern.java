
interface State{
    public void doAction(Context context);
}

class StartState implements State{
    public void doAction(Context context){
        System.out.println("player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "start state";
    }
}

class StopState implements State{
    public void doAction(Context context){
        System.out.println("player is in stop state");
        context.setState(this);
    }
}


class Context{
    private State state;
    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}

public class StatePattern {
    public static void main(String[] args) {
        Context context = new Context();
        StartState startState = new StartState();

        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopstate = new StopState();

        stopstate.doAction(context);

        System.out.println(context.getState());
    }

}
