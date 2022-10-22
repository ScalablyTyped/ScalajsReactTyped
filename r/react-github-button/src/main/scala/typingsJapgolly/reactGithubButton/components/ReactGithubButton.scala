package typingsJapgolly.reactGithubButton.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactGithubButton.mod.ReactGitHubButtonProps
import typingsJapgolly.reactGithubButton.mod.default
import typingsJapgolly.reactGithubButton.reactGithubButtonStrings.forks
import typingsJapgolly.reactGithubButton.reactGithubButtonStrings.large
import typingsJapgolly.reactGithubButton.reactGithubButtonStrings.stargazers
import typingsJapgolly.reactGithubButton.reactGithubButtonStrings.watchers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactGithubButton {
  
  inline def apply(namespace: String, repo: String, `type`: stargazers | watchers | forks): Builder = {
    val __props = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactGitHubButtonProps]))
  }
  
  @JSImport("react-github-button", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def size(value: large): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactGitHubButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
