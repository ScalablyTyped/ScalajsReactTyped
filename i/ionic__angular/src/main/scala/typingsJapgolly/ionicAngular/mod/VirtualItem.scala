package typingsJapgolly.ionicAngular.mod

import typingsJapgolly.angularCore.mod.TemplateRef
import typingsJapgolly.angularCore.mod.ViewContainerRef
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.directivesVirtualScrollVirtualUtilsMod.VirtualContext
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.`[virtualItem]`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular", "VirtualItem")
@js.native
open class VirtualItem protected ()
  extends typingsJapgolly.ionicAngular.directivesVirtualScrollVirtualItemMod.VirtualItem {
  def this(templateRef: TemplateRef[VirtualContext], viewContainer: ViewContainerRef) = this()
}
/* static members */
object VirtualItem {
  
  @JSImport("@ionic/angular", "VirtualItem")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular", "VirtualItem.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    typingsJapgolly.ionicAngular.directivesVirtualScrollVirtualItemMod.VirtualItem, 
    `[virtualItem]`, 
    scala.Nothing, 
    js.Object, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `false`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      typingsJapgolly.ionicAngular.directivesVirtualScrollVirtualItemMod.VirtualItem, 
      `[virtualItem]`, 
      scala.Nothing, 
      js.Object, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular", "VirtualItem.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[
    typingsJapgolly.ionicAngular.directivesVirtualScrollVirtualItemMod.VirtualItem, 
    scala.Nothing
  ] = js.native
  inline def ɵfac_=(
    x: ɵɵFactoryDeclaration[
      typingsJapgolly.ionicAngular.directivesVirtualScrollVirtualItemMod.VirtualItem, 
      scala.Nothing
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
