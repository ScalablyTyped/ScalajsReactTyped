package typingsJapgolly.typedGithubApi

import typingsJapgolly.typedGithubApi.distGithubRefMod.GitHubRef
import typingsJapgolly.typedGithubApi.distGithubRefMod.OptionsOrRef
import typingsJapgolly.typedGithubApi.distInterfacesLabelMod.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLabelMod {
  
  @JSImport("typed-github-api/dist/label", "LabelClass")
  @js.native
  open class LabelClass protected ()
    extends GitHubRef
       with Label {
    def this(data: typingsJapgolly.typedGithubApi.distApiInterfacesLabelMod.Label, options: OptionsOrRef) = this()
    
    /* CompleteClass */
    var default: Boolean = js.native
    
    /* CompleteClass */
    var color: String = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
