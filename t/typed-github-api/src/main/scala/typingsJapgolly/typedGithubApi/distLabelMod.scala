package typingsJapgolly.typedGithubApi

import typingsJapgolly.typedGithubApi.githubRefMod.GitHubRef
import typingsJapgolly.typedGithubApi.githubRefMod.OptionsOrRef
import typingsJapgolly.typedGithubApi.interfacesLabelMod.Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/label", JSImport.Namespace)
@js.native
object distLabelMod extends js.Object {
  @js.native
  class LabelClass protected ()
    extends GitHubRef
       with Label {
    def this(data: typingsJapgolly.typedGithubApi.labelMod.Label, options: OptionsOrRef) = this()
    /* CompleteClass */
    override var color: String = js.native
    /* CompleteClass */
    override var default: Boolean = js.native
    /* CompleteClass */
    override var id: Double = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
}

