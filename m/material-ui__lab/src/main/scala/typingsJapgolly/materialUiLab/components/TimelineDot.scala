package typingsJapgolly.materialUiLab.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUiLab.anon.PartialClassNameMapTimeliDefaultDefault
import typingsJapgolly.materialUiLab.materialUiLabStrings.default
import typingsJapgolly.materialUiLab.materialUiLabStrings.grey
import typingsJapgolly.materialUiLab.materialUiLabStrings.inherit
import typingsJapgolly.materialUiLab.materialUiLabStrings.outlined
import typingsJapgolly.materialUiLab.materialUiLabStrings.primary
import typingsJapgolly.materialUiLab.materialUiLabStrings.secondary
import typingsJapgolly.materialUiLab.timelineDotTimelineDotMod.TimelineDotProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimelineDot {
  
  @JSImport("@material-ui/lab", "TimelineDot")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classes(value: PartialClassNameMapTimeliDefaultDefault): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def color(value: inherit | primary | secondary | grey): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def innerRef(value: Ref[Any]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    inline def innerRefFunction1(value: Any | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def innerRefNull: this.type = set("innerRef", null)
    
    inline def ref(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {} extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
    ): this.type = set("ref", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def variant(value: default | outlined): this.type = set("variant", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TimelineDot.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TimelineDotProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
