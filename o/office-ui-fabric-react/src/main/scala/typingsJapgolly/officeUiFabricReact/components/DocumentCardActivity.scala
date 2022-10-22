package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardActivityDottypesMod.IDocumentCardActivity
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardActivityDottypesMod.IDocumentCardActivityPerson
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardActivityDottypesMod.IDocumentCardActivityProps
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardActivityDottypesMod.IDocumentCardActivityStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardActivityDottypesMod.IDocumentCardActivityStyles
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentCardActivity {
  
  inline def apply(activity: String, people: js.Array[IDocumentCardActivityPerson]): Builder = {
    val __props = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], people = people.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDocumentCardActivityProps]))
  }
  
  @JSImport("office-ui-fabric-react", "DocumentCardActivity")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardActivityDotbaseMod.DocumentCardActivityBase
        ] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IDocumentCardActivity]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IDocumentCardActivity | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IDocumentCardActivity | Null) => value(t0).runNow()))
    
    inline def styles(value: IStyleFunctionOrObject[IDocumentCardActivityStyleProps, IDocumentCardActivityStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IDocumentCardActivityStyleProps => DeepPartial[IDocumentCardActivityStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDocumentCardActivityProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
