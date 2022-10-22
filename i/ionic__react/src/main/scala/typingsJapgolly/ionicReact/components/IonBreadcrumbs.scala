package typingsJapgolly.ionicReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonBreadcrumbsElement
import typingsJapgolly.ionicReact.anon.PickHTMLAttributesHTMLIonAriachecked
import typingsJapgolly.ionicReact.distTypesComponentsReactComponentLibInterfacesMod.StyleReactProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for (/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.IonBreadcrumbs * / scala.Any) & typingsJapgolly.ionicReact.anon.PickHTMLAttributesHTMLIonAriachecked & typingsJapgolly.ionicReact.distTypesComponentsReactComponentLibInterfacesMod.StyleReactProps & (typingsJapgolly.react.mod.RefAttributes[
typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonBreadcrumbsElement]) because: IArray(Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.IonBreadcrumbs * / scala.Any because couldn't resolve ClassTree.) */
object IonBreadcrumbs {
  
  def apply(
    p: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.IonBreadcrumbs */ Any) & PickHTMLAttributesHTMLIonAriachecked & StyleReactProps & RefAttributes[HTMLIonBreadcrumbsElement]
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@ionic/react", "IonBreadcrumbs")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: IonBreadcrumbs.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
