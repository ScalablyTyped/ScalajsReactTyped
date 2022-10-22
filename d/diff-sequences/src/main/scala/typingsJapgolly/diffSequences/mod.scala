package typingsJapgolly.diffSequences

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("diff-sequences", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(aLength: Double, bLength: Double, isCommon: IsCommon, foundSubsequence: FoundSubsequence): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(aLength.asInstanceOf[js.Any], bLength.asInstanceOf[js.Any], isCommon.asInstanceOf[js.Any], foundSubsequence.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Callbacks extends StObject {
    
    def foundSubsequence(
      nCommon: Double,
      // caller can assume: 0 < nCommon
    aCommon: Double,
      // caller can assume: 0 <= aCommon && aCommon < aLength
    bCommon: Double
    ): Unit
    @JSName("foundSubsequence")
    var foundSubsequence_Original: FoundSubsequence
    
    def isCommon(aIndex: Double, // caller can assume: 0 <= aIndex && aIndex < aLength
    bIndex: Double): Boolean
    @JSName("isCommon")
    var isCommon_Original: IsCommon
  }
  object Callbacks {
    
    inline def apply(
      foundSubsequence: (/* nCommon */ Double, /* aCommon */ Double, /* bCommon */ Double) => Callback,
      isCommon: (/* aIndex */ Double, /* bIndex */ Double) => Boolean
    ): Callbacks = {
      val __obj = js.Dynamic.literal(foundSubsequence = js.Any.fromFunction3((t0: /* nCommon */ Double, t1: /* aCommon */ Double, t2: /* bCommon */ Double) => (foundSubsequence(t0, t1, t2)).runNow()), isCommon = js.Any.fromFunction2(isCommon))
      __obj.asInstanceOf[Callbacks]
    }
    
    extension [Self <: Callbacks](x: Self) {
      
      inline def setFoundSubsequence(value: (/* nCommon */ Double, /* aCommon */ Double, /* bCommon */ Double) => Callback): Self = StObject.set(x, "foundSubsequence", js.Any.fromFunction3((t0: /* nCommon */ Double, t1: /* aCommon */ Double, t2: /* bCommon */ Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setIsCommon(value: (/* aIndex */ Double, /* bIndex */ Double) => Boolean): Self = StObject.set(x, "isCommon", js.Any.fromFunction2(value))
    }
  }
  
  type FoundSubsequence = js.Function3[/* nCommon */ Double, /* aCommon */ Double, /* bCommon */ Double, Unit]
  
  /**
    * Copyright (c) Facebook, Inc. and its affiliates. All Rights Reserved.
    *
    * This source code is licensed under the MIT license found in the
    * LICENSE file in the root directory of this source tree.
    *
    */
  type IsCommon = js.Function2[/* aIndex */ Double, /* bIndex */ Double, Boolean]
}
