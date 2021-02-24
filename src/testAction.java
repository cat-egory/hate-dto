import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

public class testAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // https://madplay.github.io/post/creating-an-intellij-plugin-action
        Messages.showInputDialog("짜장면이 좋아요 짬뽕이 좋아요?", "당신의 선택은", Messages.getQuestionIcon());

    }
}
