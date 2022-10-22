package typingsJapgolly.reactSplitterLayout.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSplitterLayout.mod.SplitterLayoutProps
import typingsJapgolly.reactSplitterLayout.mod.TPrimaryIndex
import typingsJapgolly.reactSplitterLayout.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSplitterLayout {
  
  @JSImport("react-splitter-layout", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def customClassName(value: String): this.type = set("customClassName", value.asInstanceOf[js.Any])
    
    inline def onDragEnd(value: Callback): this.type = set("onDragEnd", value.toJsFn)
    
    inline def onDragStart(value: Callback): this.type = set("onDragStart", value.toJsFn)
    
    inline def onSecondaryPaneSizeChange(value: /* value */ Double => Callback): this.type = set("onSecondaryPaneSizeChange", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def percentage(value: Boolean): this.type = set("percentage", value.asInstanceOf[js.Any])
    
    inline def primaryIndex(value: TPrimaryIndex): this.type = set("primaryIndex", value.asInstanceOf[js.Any])
    
    inline def primaryMinSize(value: Double): this.type = set("primaryMinSize", value.asInstanceOf[js.Any])
    
    inline def secondaryInitialSize(value: Double): this.type = set("secondaryInitialSize", value.asInstanceOf[js.Any])
    
    inline def secondaryMinSize(value: Double): this.type = set("secondaryMinSize", value.asInstanceOf[js.Any])
    
    inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactSplitterLayout.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SplitterLayoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
