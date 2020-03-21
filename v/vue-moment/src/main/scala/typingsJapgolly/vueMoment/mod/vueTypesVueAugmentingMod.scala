package typingsJapgolly.vueMoment.mod

import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.moment.mod.MomentFormatSpecification
import typingsJapgolly.moment.mod.MomentInput
import typingsJapgolly.vueMoment.mod.VueMomentPlugin.Options
import typingsJapgolly.vueMoment.mod.VueMomentPlugin.VueStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue/types/vue", JSImport.Namespace)
@js.native
object vueTypesVueAugmentingMod extends js.Object {
  @js.native
  trait Vue extends js.Object {
    @JSName("$moment")
    var $moment_Original: VueStatic = js.native
    @JSName("$moment")
    def $moment(): Moment = js.native
    @JSName("$moment")
    def $moment(inp: MomentInput): Moment = js.native
    @JSName("$moment")
    def $moment(inp: MomentInput, format: MomentFormatSpecification): Moment = js.native
    @JSName("$moment")
    def $moment(inp: MomentInput, format: MomentFormatSpecification, language: String): Moment = js.native
    @JSName("$moment")
    def $moment(inp: MomentInput, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = js.native
    @JSName("$moment")
    def $moment(inp: MomentInput, format: MomentFormatSpecification, strict: Boolean): Moment = js.native
    @JSName("$moment")
    def $moment(options: Options): Unit = js.native
  }
  
}

