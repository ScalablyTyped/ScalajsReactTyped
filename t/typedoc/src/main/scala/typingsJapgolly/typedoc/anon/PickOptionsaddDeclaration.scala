package typingsJapgolly.typedoc.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.KeyToDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typedoc.typedoc/dist/lib/utils/options.Options, 'addDeclaration'> */
trait PickOptionsaddDeclaration extends StObject {
  
  def addDeclaration[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typingsJapgolly.typedoc.typedocStrings.searchCategoryBoosts, typingsJapgolly.typedoc.typedocStrings.version, typingsJapgolly.typedoc.typedocStrings.out */ Any */](declaration: NameK[K] & KeyToDeclaration[K]): Unit
  @JSName("addDeclaration")
  var addDeclaration_Original: js.Function1[
    /* declaration */ (NameK[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typingsJapgolly.typedoc.typedocStrings.searchCategoryBoosts, typingsJapgolly.typedoc.typedocStrings.version, typingsJapgolly.typedoc.typedocStrings.out */ Any
    ]) & (KeyToDeclaration[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typingsJapgolly.typedoc.typedocStrings.searchCategoryBoosts, typingsJapgolly.typedoc.typedocStrings.version, typingsJapgolly.typedoc.typedocStrings.out */ Any
    ]), 
    Unit
  ]
}
object PickOptionsaddDeclaration {
  
  inline def apply(
    addDeclaration: /* declaration */ (NameK[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typingsJapgolly.typedoc.typedocStrings.searchCategoryBoosts, typingsJapgolly.typedoc.typedocStrings.version, typingsJapgolly.typedoc.typedocStrings.out */ Any
    ]) & (KeyToDeclaration[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typingsJapgolly.typedoc.typedocStrings.searchCategoryBoosts, typingsJapgolly.typedoc.typedocStrings.version, typingsJapgolly.typedoc.typedocStrings.out */ Any
    ]) => Callback
  ): PickOptionsaddDeclaration = {
    val __obj = js.Dynamic.literal(addDeclaration = js.Any.fromFunction1((t0: /* declaration */ (NameK[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typingsJapgolly.typedoc.typedocStrings.searchCategoryBoosts, typingsJapgolly.typedoc.typedocStrings.version, typingsJapgolly.typedoc.typedocStrings.out */ Any
    ]) & (KeyToDeclaration[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typingsJapgolly.typedoc.typedocStrings.searchCategoryBoosts, typingsJapgolly.typedoc.typedocStrings.version, typingsJapgolly.typedoc.typedocStrings.out */ Any
    ])) => addDeclaration(t0).runNow()))
    __obj.asInstanceOf[PickOptionsaddDeclaration]
  }
  
  extension [Self <: PickOptionsaddDeclaration](x: Self) {
    
    inline def setAddDeclaration(
      value: /* declaration */ (NameK[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typingsJapgolly.typedoc.typedocStrings.searchCategoryBoosts, typingsJapgolly.typedoc.typedocStrings.version, typingsJapgolly.typedoc.typedocStrings.out */ Any
        ]) & (KeyToDeclaration[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typingsJapgolly.typedoc.typedocStrings.searchCategoryBoosts, typingsJapgolly.typedoc.typedocStrings.version, typingsJapgolly.typedoc.typedocStrings.out */ Any
        ]) => Callback
    ): Self = StObject.set(x, "addDeclaration", js.Any.fromFunction1((t0: /* declaration */ (NameK[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typingsJapgolly.typedoc.typedocStrings.searchCategoryBoosts, typingsJapgolly.typedoc.typedocStrings.version, typingsJapgolly.typedoc.typedocStrings.out */ Any
        ]) & (KeyToDeclaration[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typingsJapgolly.typedoc.typedocStrings.searchCategoryBoosts, typingsJapgolly.typedoc.typedocStrings.version, typingsJapgolly.typedoc.typedocStrings.out */ Any
        ])) => value(t0).runNow()))
  }
}
