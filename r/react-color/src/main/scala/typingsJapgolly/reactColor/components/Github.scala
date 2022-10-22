package typingsJapgolly.reactColor.components

import typingsJapgolly.reactColor.libComponentsGithubGithubMod.GithubPickerProps
import typingsJapgolly.reactColor.libComponentsGithubGithubMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Github {
  
  @JSImport("react-color/lib/components/github/Github", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Github.type): SharedBuilder_GithubPickerProps_1845837647[default] = new SharedBuilder_GithubPickerProps_1845837647[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GithubPickerProps): SharedBuilder_GithubPickerProps_1845837647[default] = new SharedBuilder_GithubPickerProps_1845837647[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
