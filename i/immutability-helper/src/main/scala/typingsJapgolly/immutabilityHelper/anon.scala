package typingsJapgolly.immutabilityHelper

import typingsJapgolly.immutabilityHelper.mod.SetSpec
import typingsJapgolly.immutabilityHelper.mod._ArraySpec
import typingsJapgolly.immutabilityHelper.mod._MapSpec
import typingsJapgolly.immutabilityHelper.mod._ObjectSpec
import typingsJapgolly.immutabilityHelper.mod._Spec
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Add[K, V]
    extends StObject
       with _MapSpec[K, V, Any] {
    
    @JSName("$add")
    var $add: js.Array[js.Tuple2[K, V]]
  }
  object Add {
    
    inline def apply[K, V]($add: js.Array[js.Tuple2[K, V]]): Add[K, V] = {
      val __obj = js.Dynamic.literal($add = $add.asInstanceOf[js.Any])
      __obj.asInstanceOf[Add[K, V]]
    }
    
    extension [Self <: Add[?, ?], K, V](x: Self & (Add[K, V])) {
      
      inline def set$add(value: js.Array[js.Tuple2[K, V]]): Self = StObject.set(x, "$add", value.asInstanceOf[js.Any])
      
      inline def set$addVarargs(value: (js.Tuple2[K, V])*): Self = StObject.set(x, "$add", js.Array(value*))
    }
  }
  
  trait AddReadonlyArray[T]
    extends StObject
       with SetSpec[T] {
    
    @JSName("$add")
    var $add: js.Array[T]
  }
  object AddReadonlyArray {
    
    inline def apply[T]($add: js.Array[T]): AddReadonlyArray[T] = {
      val __obj = js.Dynamic.literal($add = $add.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddReadonlyArray[T]]
    }
    
    extension [Self <: AddReadonlyArray[?], T](x: Self & AddReadonlyArray[T]) {
      
      inline def set$add(value: js.Array[T]): Self = StObject.set(x, "$add", value.asInstanceOf[js.Any])
      
      inline def set$addVarargs(value: T*): Self = StObject.set(x, "$add", js.Array(value*))
    }
  }
  
  trait Apply[T]
    extends StObject
       with _Spec[T, Any] {
    
    @JSName("$apply")
    def $apply(v: T): T
  }
  object Apply {
    
    inline def apply[T]($apply: T => T): Apply[T] = {
      val __obj = js.Dynamic.literal($apply = js.Any.fromFunction1($apply))
      __obj.asInstanceOf[Apply[T]]
    }
    
    extension [Self <: Apply[?], T](x: Self & Apply[T]) {
      
      inline def set$apply(value: T => T): Self = StObject.set(x, "$apply", js.Any.fromFunction1(value))
    }
  }
  
  trait Merge[T]
    extends StObject
       with _ObjectSpec[T, Any] {
    
    @JSName("$merge")
    var $merge: Partial[T]
  }
  object Merge {
    
    inline def apply[T]($merge: Partial[T]): Merge[T] = {
      val __obj = js.Dynamic.literal($merge = $merge.asInstanceOf[js.Any])
      __obj.asInstanceOf[Merge[T]]
    }
    
    extension [Self <: Merge[?], T](x: Self & Merge[T]) {
      
      inline def set$merge(value: Partial[T]): Self = StObject.set(x, "$merge", value.asInstanceOf[js.Any])
    }
  }
  
  trait NoInferenceCustomCommandsBrand extends StObject {
    
    var __noInferenceCustomCommandsBrand: Any
  }
  object NoInferenceCustomCommandsBrand {
    
    inline def apply(__noInferenceCustomCommandsBrand: Any): NoInferenceCustomCommandsBrand = {
      val __obj = js.Dynamic.literal(__noInferenceCustomCommandsBrand = __noInferenceCustomCommandsBrand.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoInferenceCustomCommandsBrand]
    }
    
    extension [Self <: NoInferenceCustomCommandsBrand](x: Self) {
      
      inline def set__noInferenceCustomCommandsBrand(value: Any): Self = StObject.set(x, "__noInferenceCustomCommandsBrand", value.asInstanceOf[js.Any])
    }
  }
  
  trait Push[T]
    extends StObject
       with _ArraySpec[T, Any] {
    
    @JSName("$push")
    var $push: js.Array[T]
  }
  object Push {
    
    inline def apply[T]($push: js.Array[T]): Push[T] = {
      val __obj = js.Dynamic.literal($push = $push.asInstanceOf[js.Any])
      __obj.asInstanceOf[Push[T]]
    }
    
    extension [Self <: Push[?], T](x: Self & Push[T]) {
      
      inline def set$push(value: js.Array[T]): Self = StObject.set(x, "$push", value.asInstanceOf[js.Any])
      
      inline def set$pushVarargs(value: T*): Self = StObject.set(x, "$push", js.Array(value*))
    }
  }
  
  trait Remove[K]
    extends StObject
       with _MapSpec[K, Any, Any] {
    
    @JSName("$remove")
    var $remove: js.Array[K]
  }
  object Remove {
    
    inline def apply[K]($remove: js.Array[K]): Remove[K] = {
      val __obj = js.Dynamic.literal($remove = $remove.asInstanceOf[js.Any])
      __obj.asInstanceOf[Remove[K]]
    }
    
    extension [Self <: Remove[?], K](x: Self & Remove[K]) {
      
      inline def set$remove(value: js.Array[K]): Self = StObject.set(x, "$remove", value.asInstanceOf[js.Any])
      
      inline def set$removeVarargs(value: K*): Self = StObject.set(x, "$remove", js.Array(value*))
    }
  }
  
  trait RemoveReadonlyArray[T]
    extends StObject
       with SetSpec[T] {
    
    @JSName("$remove")
    var $remove: js.Array[T]
  }
  object RemoveReadonlyArray {
    
    inline def apply[T]($remove: js.Array[T]): RemoveReadonlyArray[T] = {
      val __obj = js.Dynamic.literal($remove = $remove.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveReadonlyArray[T]]
    }
    
    extension [Self <: RemoveReadonlyArray[?], T](x: Self & RemoveReadonlyArray[T]) {
      
      inline def set$remove(value: js.Array[T]): Self = StObject.set(x, "$remove", value.asInstanceOf[js.Any])
      
      inline def set$removeVarargs(value: T*): Self = StObject.set(x, "$remove", js.Array(value*))
    }
  }
  
  trait Set[T]
    extends StObject
       with _Spec[T, Any] {
    
    @JSName("$set")
    var $set: T
  }
  object Set {
    
    inline def apply[T]($set: T): Set[T] = {
      val __obj = js.Dynamic.literal($set = $set.asInstanceOf[js.Any])
      __obj.asInstanceOf[Set[T]]
    }
    
    extension [Self <: Set[?], T](x: Self & Set[T]) {
      
      inline def set$set(value: T): Self = StObject.set(x, "$set", value.asInstanceOf[js.Any])
    }
  }
  
  trait Splice[T]
    extends StObject
       with _ArraySpec[T, Any] {
    
    @JSName("$splice")
    var $splice: js.Array[(js.Tuple2[Double, js.UndefOr[Double]]) | (Array[Double | T])]
  }
  object Splice {
    
    inline def apply[T]($splice: js.Array[(js.Tuple2[Double, js.UndefOr[Double]]) | (Array[Double | T])]): Splice[T] = {
      val __obj = js.Dynamic.literal($splice = $splice.asInstanceOf[js.Any])
      __obj.asInstanceOf[Splice[T]]
    }
    
    extension [Self <: Splice[?], T](x: Self & Splice[T]) {
      
      inline def set$splice(value: js.Array[(js.Tuple2[Double, js.UndefOr[Double]]) | (Array[Double | T])]): Self = StObject.set(x, "$splice", value.asInstanceOf[js.Any])
      
      inline def set$spliceVarargs(value: ((js.Tuple2[Double, js.UndefOr[Double]]) | (Array[Double | T]))*): Self = StObject.set(x, "$splice", js.Array(value*))
    }
  }
  
  trait Toggle[T]
    extends StObject
       with _ObjectSpec[T, Any] {
    
    @JSName("$toggle")
    var $toggle: js.Array[/* keyof T */ String]
  }
  object Toggle {
    
    inline def apply[T]($toggle: js.Array[/* keyof T */ String]): Toggle[T] = {
      val __obj = js.Dynamic.literal($toggle = $toggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Toggle[T]]
    }
    
    extension [Self <: Toggle[?], T](x: Self & Toggle[T]) {
      
      inline def set$toggle(value: js.Array[/* keyof T */ String]): Self = StObject.set(x, "$toggle", value.asInstanceOf[js.Any])
      
      inline def set$toggleVarargs(value: (/* keyof T */ String)*): Self = StObject.set(x, "$toggle", js.Array(value*))
    }
  }
  
  trait Unset[T]
    extends StObject
       with _ObjectSpec[T, Any] {
    
    @JSName("$unset")
    var $unset: js.Array[/* keyof T */ String]
  }
  object Unset {
    
    inline def apply[T]($unset: js.Array[/* keyof T */ String]): Unset[T] = {
      val __obj = js.Dynamic.literal($unset = $unset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unset[T]]
    }
    
    extension [Self <: Unset[?], T](x: Self & Unset[T]) {
      
      inline def set$unset(value: js.Array[/* keyof T */ String]): Self = StObject.set(x, "$unset", value.asInstanceOf[js.Any])
      
      inline def set$unsetVarargs(value: (/* keyof T */ String)*): Self = StObject.set(x, "$unset", js.Array(value*))
    }
  }
  
  trait Unshift[T]
    extends StObject
       with _ArraySpec[T, Any] {
    
    @JSName("$unshift")
    var $unshift: js.Array[T]
  }
  object Unshift {
    
    inline def apply[T]($unshift: js.Array[T]): Unshift[T] = {
      val __obj = js.Dynamic.literal($unshift = $unshift.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unshift[T]]
    }
    
    extension [Self <: Unshift[?], T](x: Self & Unshift[T]) {
      
      inline def set$unshift(value: js.Array[T]): Self = StObject.set(x, "$unshift", value.asInstanceOf[js.Any])
      
      inline def set$unshiftVarargs(value: T*): Self = StObject.set(x, "$unshift", js.Array(value*))
    }
  }
}
