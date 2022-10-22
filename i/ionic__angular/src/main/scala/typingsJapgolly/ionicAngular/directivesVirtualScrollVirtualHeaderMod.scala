package typingsJapgolly.ionicAngular

import typingsJapgolly.angularCore.mod.TemplateRef
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.directivesVirtualScrollVirtualUtilsMod.VirtualContext
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.`[virtualHeader]`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesVirtualScrollVirtualHeaderMod {
  
  @JSImport("@ionic/angular/directives/virtual-scroll/virtual-header", "VirtualHeader")
  @js.native
  open class VirtualHeader protected () extends StObject {
    def this(templateRef: TemplateRef[VirtualContext]) = this()
    
    var templateRef: TemplateRef[VirtualContext] = js.native
  }
  /* static members */
  object VirtualHeader {
    
    @JSImport("@ionic/angular/directives/virtual-scroll/virtual-header", "VirtualHeader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/angular/directives/virtual-scroll/virtual-header", "VirtualHeader.\u0275dir")
    @js.native
    def ɵdir: ɵɵDirectiveDeclaration[
        VirtualHeader, 
        `[virtualHeader]`, 
        scala.Nothing, 
        js.Object, 
        js.Object, 
        scala.Nothing, 
        scala.Nothing, 
        `false`
      ] = js.native
    inline def ɵdir_=(
      x: ɵɵDirectiveDeclaration[
          VirtualHeader, 
          `[virtualHeader]`, 
          scala.Nothing, 
          js.Object, 
          js.Object, 
          scala.Nothing, 
          scala.Nothing, 
          `false`
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/angular/directives/virtual-scroll/virtual-header", "VirtualHeader.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[VirtualHeader, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[VirtualHeader, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  }
}
