package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUiCore.anon.PartialClassNameMapCollap
import typingsJapgolly.materialUiCore.collapseCollapseMod.CollapseProps
import typingsJapgolly.materialUiCore.materialUiCoreStrings.auto
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collapse {
  
  @JSImport("@material-ui/core", "Collapse")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def addEndListener(value: Any): this.type = set("addEndListener", value.asInstanceOf[js.Any])
    
    inline def appear(value: Boolean): this.type = set("appear", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classes(value: PartialClassNameMapCollap): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def collapsedHeight(value: String | Double): this.type = set("collapsedHeight", value.asInstanceOf[js.Any])
    
    inline def collapsedSize(value: String | Double): this.type = set("collapsedSize", value.asInstanceOf[js.Any])
    
    inline def component(value: ElementType): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def disableStrictModeCompat(value: Boolean): this.type = set("disableStrictModeCompat", value.asInstanceOf[js.Any])
    
    inline def enter(value: Boolean): this.type = set("enter", value.asInstanceOf[js.Any])
    
    inline def exit(value: Boolean): this.type = set("exit", value.asInstanceOf[js.Any])
    
    inline def in(value: Boolean): this.type = set("in", value.asInstanceOf[js.Any])
    
    inline def innerRef(value: Ref[Any]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    inline def innerRefFunction1(value: Any | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def innerRefNull: this.type = set("innerRef", null)
    
    inline def mountOnEnter(value: Any): this.type = set("mountOnEnter", value.asInstanceOf[js.Any])
    
    inline def onEnter(value: Any): this.type = set("onEnter", value.asInstanceOf[js.Any])
    
    inline def onEntered(value: Any): this.type = set("onEntered", value.asInstanceOf[js.Any])
    
    inline def onEntering(value: Any): this.type = set("onEntering", value.asInstanceOf[js.Any])
    
    inline def onExit(value: Any): this.type = set("onExit", value.asInstanceOf[js.Any])
    
    inline def onExited(value: Any): this.type = set("onExited", value.asInstanceOf[js.Any])
    
    inline def onExiting(value: Any): this.type = set("onExiting", value.asInstanceOf[js.Any])
    
    inline def ref(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.@material-ui/core/transitions/transition.TransitionProps extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
    ): this.type = set("ref", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def timeout(value: Any | auto): this.type = set("timeout", value.asInstanceOf[js.Any])
    
    inline def unmountOnExit(value: Any): this.type = set("unmountOnExit", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Collapse.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CollapseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
