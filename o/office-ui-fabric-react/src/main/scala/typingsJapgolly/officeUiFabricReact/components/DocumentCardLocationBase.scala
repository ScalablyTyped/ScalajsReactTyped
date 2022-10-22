package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardLocationDottypesMod.IDocumentCardLocation
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardLocationDottypesMod.IDocumentCardLocationProps
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardLocationDottypesMod.IDocumentCardLocationStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardLocationDottypesMod.IDocumentCardLocationStyles
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentCardLocationBase {
  
  inline def apply(location: String): Builder = {
    val __props = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDocumentCardLocationProps]))
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardLocation.base", "DocumentCardLocationBase")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardLocationDotbaseMod.DocumentCardLocationBase
        ] {
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IDocumentCardLocation]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IDocumentCardLocation | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IDocumentCardLocation | Null) => value(t0).runNow()))
    
    inline def locationHref(value: String): this.type = set("locationHref", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]]) => value(t0).runNow()))
    
    inline def styles(value: IStyleFunctionOrObject[IDocumentCardLocationStyleProps, IDocumentCardLocationStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IDocumentCardLocationStyleProps => DeepPartial[IDocumentCardLocationStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDocumentCardLocationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
