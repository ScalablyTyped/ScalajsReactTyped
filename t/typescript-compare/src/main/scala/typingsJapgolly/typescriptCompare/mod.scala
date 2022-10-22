package typingsJapgolly.typescriptCompare

import typingsJapgolly.typescriptCompare.typescriptCompareBooleans.`true`
import typingsJapgolly.typescriptCompare.typescriptCompareInts.`0`
import typingsJapgolly.typescriptCompare.typescriptCompareInts.`1`
import typingsJapgolly.typescriptCompare.typescriptCompareStrings.broaderLeft
import typingsJapgolly.typescriptCompare.typescriptCompareStrings.broaderRight
import typingsJapgolly.typescriptCompare.typescriptCompareStrings.equal
import typingsJapgolly.typescriptCompare.typescriptCompareStrings.mismatch
import typingsJapgolly.typescriptLogic.mod.And
import typingsJapgolly.typescriptLogic.mod.If
import typingsJapgolly.typescriptLogic.mod.Not
import typingsJapgolly.typescriptLogic.mod.Or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type Any[Type] = And[
    typingsJapgolly.typescriptCompare.mod.prv.Extends[Type, `0`], 
    typingsJapgolly.typescriptCompare.mod.prv.Extends[Type, `1`]
  ]
  
  object Compare {
    
    trait Options extends StObject {
      
      var broaderLeft: scala.Any
      
      var broaderRight: scala.Any
      
      var equal: scala.Any
      
      var mismatch: scala.Any
    }
    object Options {
      
      inline def apply(broaderLeft: scala.Any, broaderRight: scala.Any, equal: scala.Any, mismatch: scala.Any): Options = {
        val __obj = js.Dynamic.literal(broaderLeft = broaderLeft.asInstanceOf[js.Any], broaderRight = broaderRight.asInstanceOf[js.Any], equal = equal.asInstanceOf[js.Any], mismatch = mismatch.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      trait Default
        extends StObject
           with Options {
        
        @JSName("broaderLeft")
        var broaderLeft_Default: broaderLeft
        
        @JSName("broaderRight")
        var broaderRight_Default: broaderRight
        
        @JSName("equal")
        var equal_Default: equal
        
        @JSName("mismatch")
        var mismatch_Default: mismatch
      }
      object Default {
        
        inline def apply(): Default = {
          val __obj = js.Dynamic.literal(broaderLeft = "broaderLeft", broaderRight = "broaderRight", equal = "equal", mismatch = "mismatch")
          __obj.asInstanceOf[Default]
        }
        
        extension [Self <: Default](x: Self) {
          
          inline def setBroaderLeft(value: broaderLeft): Self = StObject.set(x, "broaderLeft", value.asInstanceOf[js.Any])
          
          inline def setBroaderRight(value: broaderRight): Self = StObject.set(x, "broaderRight", value.asInstanceOf[js.Any])
          
          inline def setEqual(value: equal): Self = StObject.set(x, "equal", value.asInstanceOf[js.Any])
          
          inline def setMismatch(value: mismatch): Self = StObject.set(x, "mismatch", value.asInstanceOf[js.Any])
        }
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setBroaderLeft(value: scala.Any): Self = StObject.set(x, "broaderLeft", value.asInstanceOf[js.Any])
        
        inline def setBroaderRight(value: scala.Any): Self = StObject.set(x, "broaderRight", value.asInstanceOf[js.Any])
        
        inline def setEqual(value: scala.Any): Self = StObject.set(x, "equal", value.asInstanceOf[js.Any])
        
        inline def setMismatch(value: scala.Any): Self = StObject.set(x, "mismatch", value.asInstanceOf[js.Any])
      }
    }
    
    type Strict[A, B, Options /* <: typingsJapgolly.typescriptCompare.mod.Compare.Options */] = If[
        Extends[A, B], 
        If[
          Extends[B, A], 
          /* import warning: importer.ImportType#apply Failed type conversion: Options['equal'] */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderRight'] */ js.Any
        ], 
        If[
          Extends[B, A], 
          /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderLeft'] */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: Options['mismatch'] */ js.Any
        ]
      ]
  }
  type Compare[A, B, Options /* <: typingsJapgolly.typescriptCompare.mod.Compare.Options */] = If[
    Extends[A, B], 
    If[
      Extends[B, A], 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['equal' | 'broaderRight' | 'broaderLeft'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderRight'] */ js.Any
    ], 
    If[
      Extends[B, A], 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderLeft'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['mismatch'] */ js.Any
    ]
  ]
  
  type Equal[A, B] = Or[
    And[Any[A], Any[B]], 
    And[
      And[NotAny[A, `true`, `true`], NotAny[B, `true`, `true`]], 
      And[Extends[A, B], Extends[B, A]]
    ]
  ]
  
  type Extends[A, B] = Or[
    Any[B], 
    If[Any[A], Any[B], typingsJapgolly.typescriptCompare.mod.prv.Extends[A, B]]
  ]
  
  type NotAny[Type, True, False] = Not[Any[Type]]
  
  type NotEqual[A, B] = Not[Equal[A, B]]
  
  object prv {
    
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      [A] extends [B] ? true : false
      }}}
      */
    @js.native
    trait Extends[A, B] extends StObject
  }
}
