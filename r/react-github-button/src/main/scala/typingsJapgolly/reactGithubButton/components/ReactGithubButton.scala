package typingsJapgolly.reactGithubButton.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactGithubButton.mod.ReactGitHubButtonProps
import typingsJapgolly.reactGithubButton.mod.default
import typingsJapgolly.reactGithubButton.reactGithubButtonStrings.forks
import typingsJapgolly.reactGithubButton.reactGithubButtonStrings.large
import typingsJapgolly.reactGithubButton.reactGithubButtonStrings.stargazers
import typingsJapgolly.reactGithubButton.reactGithubButtonStrings.watchers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactGithubButton {
  def apply(
    namespace: String,
    repo: String,
    `type`: stargazers | watchers | forks,
    size: large = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactGitHubButtonProps, default, Unit, ReactGitHubButtonProps] = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactGithubButton.mod.ReactGitHubButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactGithubButton.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactGithubButton.mod.ReactGitHubButtonProps])(children: _*)
  }
  @JSImport("react-github-button", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

