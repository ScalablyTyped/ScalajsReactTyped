package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardTitleDottypesMod.IDocumentCardTitle
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardTitleDottypesMod.IDocumentCardTitleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardTitleDottypesMod.IDocumentCardTitleStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardTitleDottypesMod.IDocumentCardTitleStyles
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentCardTitle {
  
  inline def apply(title: String): Builder = {
    val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDocumentCardTitleProps]))
  }
  
  @JSImport("office-ui-fabric-react", "DocumentCardTitle")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardTitleDotbaseMod.DocumentCardTitleBase
        ] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IDocumentCardTitle]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IDocumentCardTitle | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IDocumentCardTitle | Null) => value(t0).runNow()))
    
    inline def shouldTruncate(value: Boolean): this.type = set("shouldTruncate", value.asInstanceOf[js.Any])
    
    inline def showAsSecondaryTitle(value: Boolean): this.type = set("showAsSecondaryTitle", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[IDocumentCardTitleStyleProps, IDocumentCardTitleStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IDocumentCardTitleStyleProps => DeepPartial[IDocumentCardTitleStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDocumentCardTitleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
