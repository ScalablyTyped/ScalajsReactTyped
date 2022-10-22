package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardLogoDottypesMod.IDocumentCardLogo
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardLogoDottypesMod.IDocumentCardLogoProps
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardLogoDottypesMod.IDocumentCardLogoStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardLogoDottypesMod.IDocumentCardLogoStyles
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentCardLogo {
  
  inline def apply(logoIcon: String): Builder = {
    val __props = js.Dynamic.literal(logoIcon = logoIcon.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDocumentCardLogoProps]))
  }
  
  @JSImport("office-ui-fabric-react", "DocumentCardLogo")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardLogoDotbaseMod.DocumentCardLogoBase
        ] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IDocumentCardLogo]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IDocumentCardLogo | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IDocumentCardLogo | Null) => value(t0).runNow()))
    
    inline def logoName(value: String): this.type = set("logoName", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[IDocumentCardLogoStyleProps, IDocumentCardLogoStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IDocumentCardLogoStyleProps => DeepPartial[IDocumentCardLogoStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDocumentCardLogoProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
