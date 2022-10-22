package typingsJapgolly.victoryPie.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryPie.anon.Data
import typingsJapgolly.victoryPie.esMod.SliceProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slice {
  
  @JSImport("victory-pie/es", "Slice")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victoryPie.esMod.Slice] {
    
    inline def ariaLabel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrCallback */ Any
    ): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def cornerRadius(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SliceNumberOrCallback<SliceProps, 'cornerRadius'> */ Any
    ): this.type = set("cornerRadius", value.asInstanceOf[js.Any])
    
    inline def datum(value: Any): this.type = set("datum", value.asInstanceOf[js.Any])
    
    inline def innerRadius(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
    ): this.type = set("innerRadius", value.asInstanceOf[js.Any])
    
    inline def padAngle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SliceNumberOrCallback<SliceProps, 'padAngle'> */ Any
    ): this.type = set("padAngle", value.asInstanceOf[js.Any])
    
    inline def pathComponent(value: VdomElement): this.type = set("pathComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def pathFunction(value: SliceProps => String): this.type = set("pathFunction", js.Any.fromFunction1(value))
    
    inline def radius(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SliceNumberOrCallback<SliceProps, 'radius'> */ Any
    ): this.type = set("radius", value.asInstanceOf[js.Any])
    
    inline def slice(value: Data): this.type = set("slice", value.asInstanceOf[js.Any])
    
    inline def sliceEndAngle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SliceNumberOrCallback<SliceProps, 'sliceEndAngle'> */ Any
    ): this.type = set("sliceEndAngle", value.asInstanceOf[js.Any])
    
    inline def sliceStartAngle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SliceNumberOrCallback<SliceProps, 'sliceStartAngle'> */ Any
    ): this.type = set("sliceStartAngle", value.asInstanceOf[js.Any])
    
    inline def style(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
    ): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabIndex(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
    ): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Slice.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SliceProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
