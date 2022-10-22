package typingsJapgolly.ionicReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonSkeletonTextElement
import typingsJapgolly.ionicReact.anon.PickHTMLAttributesHTMLIonColor
import typingsJapgolly.ionicReact.distTypesComponentsReactComponentLibInterfacesMod.StyleReactProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for (/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.IonSkeletonText * / scala.Any) & typingsJapgolly.ionicReact.anon.PickHTMLAttributesHTMLIonColor & typingsJapgolly.ionicReact.distTypesComponentsReactComponentLibInterfacesMod.StyleReactProps & (typingsJapgolly.react.mod.RefAttributes[
typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonSkeletonTextElement]) because: IArray(Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.IonSkeletonText * / scala.Any because couldn't resolve ClassTree.) */
object IonSkeletonText {
  
  def apply(
    p: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.IonSkeletonText */ Any) & PickHTMLAttributesHTMLIonColor & StyleReactProps & RefAttributes[HTMLIonSkeletonTextElement]
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@ionic/react", "IonSkeletonText")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: IonSkeletonText.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
