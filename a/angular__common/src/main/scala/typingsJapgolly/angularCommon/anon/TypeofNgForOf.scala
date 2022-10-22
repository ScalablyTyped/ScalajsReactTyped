package typingsJapgolly.angularCommon.anon

import typingsJapgolly.angularCommon.angularCommonBooleans.`true`
import typingsJapgolly.angularCommon.angularCommonStrings.`[ngFor][ngForOf]`
import typingsJapgolly.angularCore.mod.NgIterable
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofNgForOf extends StObject {
  
  /**
    * Asserts the correct type of the context for the template that `NgForOf` will render.
    *
    * The presence of this method is a signal to the Ivy template type-check compiler that the
    * `NgForOf` structural directive renders its template with a specific context type.
    */
  /* static member */
  def ngTemplateContextGuard[T, U /* <: NgIterable[T] */](dir: typingsJapgolly.angularCommon.mod.NgForOf[T, U], ctx: Any): /* is @angular/common.@angular/common.NgForOfContext<T, U> */ Boolean
  
  /* static member */
  var ɵdir: ɵɵDirectiveDeclaration[
    typingsJapgolly.angularCommon.mod.NgForOf[Any, Any], 
    `[ngFor][ngForOf]`, 
    scala.Nothing, 
    NgForOf, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `true`
  ]
  
  /* static member */
  var ɵfac: ɵɵFactoryDeclaration[typingsJapgolly.angularCommon.mod.NgForOf[Any, Any], scala.Nothing]
}
object TypeofNgForOf {
  
  inline def apply(
    ngTemplateContextGuard: (typingsJapgolly.angularCommon.mod.NgForOf[Any, Any], Any) => /* is @angular/common.@angular/common.NgForOfContext<T, U> */ Boolean,
    ɵdir: ɵɵDirectiveDeclaration[
      typingsJapgolly.angularCommon.mod.NgForOf[Any, Any], 
      `[ngFor][ngForOf]`, 
      scala.Nothing, 
      NgForOf, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `true`
    ],
    ɵfac: ɵɵFactoryDeclaration[typingsJapgolly.angularCommon.mod.NgForOf[Any, Any], scala.Nothing]
  ): TypeofNgForOf = {
    val __obj = js.Dynamic.literal(ngTemplateContextGuard = js.Any.fromFunction2(ngTemplateContextGuard), ɵdir = ɵdir.asInstanceOf[js.Any], ɵfac = ɵfac.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofNgForOf]
  }
  
  extension [Self <: TypeofNgForOf](x: Self) {
    
    inline def setNgTemplateContextGuard(
      value: (typingsJapgolly.angularCommon.mod.NgForOf[Any, Any], Any) => /* is @angular/common.@angular/common.NgForOfContext<T, U> */ Boolean
    ): Self = StObject.set(x, "ngTemplateContextGuard", js.Any.fromFunction2(value))
    
    inline def setƟdir(
      value: ɵɵDirectiveDeclaration[
          typingsJapgolly.angularCommon.mod.NgForOf[Any, Any], 
          `[ngFor][ngForOf]`, 
          scala.Nothing, 
          NgForOf, 
          js.Object, 
          scala.Nothing, 
          scala.Nothing, 
          `true`
        ]
    ): Self = StObject.set(x, "\u0275dir", value.asInstanceOf[js.Any])
    
    inline def setƟfac(value: ɵɵFactoryDeclaration[typingsJapgolly.angularCommon.mod.NgForOf[Any, Any], scala.Nothing]): Self = StObject.set(x, "\u0275fac", value.asInstanceOf[js.Any])
  }
}
