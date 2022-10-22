package typingsJapgolly.ioTs

import typingsJapgolly.fpTs.libSemigroupMod.Semigroup
import typingsJapgolly.ioTs.anon.Index
import typingsJapgolly.ioTs.ioTsStrings.Key
import typingsJapgolly.ioTs.ioTsStrings.Lazy
import typingsJapgolly.ioTs.ioTsStrings.Leaf
import typingsJapgolly.ioTs.ioTsStrings.Member
import typingsJapgolly.ioTs.ioTsStrings.Wrap
import typingsJapgolly.ioTs.libFreeSemigroupMod.FreeSemigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDecodeErrorMod {
  
  @JSImport("io-ts/lib/DecodeError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fold[E, R](patterns: Index[E, R]): js.Function1[/* e */ DecodeError[E], R] = ^.asInstanceOf[js.Dynamic].applyDynamic("fold")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* e */ DecodeError[E], R]]
  
  inline def getSemigroup[E](): Semigroup[FreeSemigroup[DecodeError[E]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")().asInstanceOf[Semigroup[FreeSemigroup[DecodeError[E]]]]
  
  inline def index[E](index: Double, kind: Kind, errors: FreeSemigroup[DecodeError[E]]): DecodeError[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(index.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[DecodeError[E]]
  
  inline def key[E](key: String, kind: Kind, errors: FreeSemigroup[DecodeError[E]]): DecodeError[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("key")(key.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[DecodeError[E]]
  
  inline def `lazy`[E](id: String, errors: FreeSemigroup[DecodeError[E]]): DecodeError[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(id.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[DecodeError[E]]
  
  inline def leaf[E](actual: Any, error: E): DecodeError[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("leaf")(actual.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[DecodeError[E]]
  
  inline def member[E](index: Double, errors: FreeSemigroup[DecodeError[E]]): DecodeError[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("member")(index.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[DecodeError[E]]
  
  @JSImport("io-ts/lib/DecodeError", "optional")
  @js.native
  val optional: typingsJapgolly.ioTs.ioTsStrings.optional = js.native
  
  @JSImport("io-ts/lib/DecodeError", "required")
  @js.native
  val required: typingsJapgolly.ioTs.ioTsStrings.required = js.native
  
  inline def wrap[E](error: E, errors: FreeSemigroup[DecodeError[E]]): DecodeError[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(error.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[DecodeError[E]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ioTs.libDecodeErrorMod.Leaf_[E]
    - typingsJapgolly.ioTs.libDecodeErrorMod.Key_[E]
    - typingsJapgolly.ioTs.libDecodeErrorMod.Index_[E]
    - typingsJapgolly.ioTs.libDecodeErrorMod.Member_[E]
    - typingsJapgolly.ioTs.libDecodeErrorMod.Lazy_[E]
    - typingsJapgolly.ioTs.libDecodeErrorMod.Wrap_[E]
  */
  trait DecodeError[E] extends StObject
  object DecodeError {
    
    inline def Index_[E](errors: FreeSemigroup[DecodeError[E]], index: Double, kind: Kind): typingsJapgolly.ioTs.libDecodeErrorMod.Index_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Index", errors = errors.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ioTs.libDecodeErrorMod.Index_[E]]
    }
    
    inline def Key_[E](errors: FreeSemigroup[DecodeError[E]], key: String, kind: Kind): typingsJapgolly.ioTs.libDecodeErrorMod.Key_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Key", errors = errors.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ioTs.libDecodeErrorMod.Key_[E]]
    }
    
    inline def Lazy_[E](errors: FreeSemigroup[DecodeError[E]], id: String): typingsJapgolly.ioTs.libDecodeErrorMod.Lazy_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Lazy", errors = errors.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ioTs.libDecodeErrorMod.Lazy_[E]]
    }
    
    inline def Leaf_[E](actual: Any, error: E): typingsJapgolly.ioTs.libDecodeErrorMod.Leaf_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Leaf", actual = actual.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ioTs.libDecodeErrorMod.Leaf_[E]]
    }
    
    inline def Member_[E](errors: FreeSemigroup[DecodeError[E]], index: Double): typingsJapgolly.ioTs.libDecodeErrorMod.Member_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Member", errors = errors.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ioTs.libDecodeErrorMod.Member_[E]]
    }
    
    inline def Wrap_[E](error: E, errors: FreeSemigroup[DecodeError[E]]): typingsJapgolly.ioTs.libDecodeErrorMod.Wrap_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Wrap", error = error.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ioTs.libDecodeErrorMod.Wrap_[E]]
    }
  }
  
  trait Index_[E]
    extends StObject
       with DecodeError[E] {
    
    val _tag: typingsJapgolly.ioTs.ioTsStrings.Index
    
    val errors: FreeSemigroup[DecodeError[E]]
    
    val index: Double
    
    val kind: Kind
  }
  object Index_ {
    
    inline def apply[E](errors: FreeSemigroup[DecodeError[E]], index: Double, kind: Kind): Index_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Index", errors = errors.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index_[E]]
    }
    
    extension [Self <: Index_[?], E](x: Self & Index_[E]) {
      
      inline def setErrors(value: FreeSemigroup[DecodeError[E]]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKind(value: Kind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def set_tag(value: typingsJapgolly.ioTs.ioTsStrings.Index): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key_[E]
    extends StObject
       with DecodeError[E] {
    
    val _tag: Key
    
    val errors: FreeSemigroup[DecodeError[E]]
    
    val key: String
    
    val kind: Kind
  }
  object Key_ {
    
    inline def apply[E](errors: FreeSemigroup[DecodeError[E]], key: String, kind: Kind): Key_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Key", errors = errors.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key_[E]]
    }
    
    extension [Self <: Key_[?], E](x: Self & Key_[E]) {
      
      inline def setErrors(value: FreeSemigroup[DecodeError[E]]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKind(value: Kind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def set_tag(value: Key): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ioTs.ioTsStrings.required
    - typingsJapgolly.ioTs.ioTsStrings.optional
  */
  trait Kind extends StObject
  object Kind {
    
    inline def optional: typingsJapgolly.ioTs.ioTsStrings.optional = "optional".asInstanceOf[typingsJapgolly.ioTs.ioTsStrings.optional]
    
    inline def required: typingsJapgolly.ioTs.ioTsStrings.required = "required".asInstanceOf[typingsJapgolly.ioTs.ioTsStrings.required]
  }
  
  trait Lazy_[E]
    extends StObject
       with DecodeError[E] {
    
    val _tag: Lazy
    
    val errors: FreeSemigroup[DecodeError[E]]
    
    val id: String
  }
  object Lazy_ {
    
    inline def apply[E](errors: FreeSemigroup[DecodeError[E]], id: String): Lazy_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Lazy", errors = errors.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lazy_[E]]
    }
    
    extension [Self <: Lazy_[?], E](x: Self & Lazy_[E]) {
      
      inline def setErrors(value: FreeSemigroup[DecodeError[E]]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def set_tag(value: Lazy): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Leaf_[E]
    extends StObject
       with DecodeError[E] {
    
    val _tag: Leaf
    
    val actual: Any
    
    val error: E
  }
  object Leaf_ {
    
    inline def apply[E](actual: Any, error: E): Leaf_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Leaf", actual = actual.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Leaf_[E]]
    }
    
    extension [Self <: Leaf_[?], E](x: Self & Leaf_[E]) {
      
      inline def setActual(value: Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setError(value: E): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def set_tag(value: Leaf): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Member_[E]
    extends StObject
       with DecodeError[E] {
    
    val _tag: Member
    
    val errors: FreeSemigroup[DecodeError[E]]
    
    val index: Double
  }
  object Member_ {
    
    inline def apply[E](errors: FreeSemigroup[DecodeError[E]], index: Double): Member_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Member", errors = errors.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Member_[E]]
    }
    
    extension [Self <: Member_[?], E](x: Self & Member_[E]) {
      
      inline def setErrors(value: FreeSemigroup[DecodeError[E]]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def set_tag(value: Member): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Wrap_[E]
    extends StObject
       with DecodeError[E] {
    
    val _tag: Wrap
    
    val error: E
    
    val errors: FreeSemigroup[DecodeError[E]]
  }
  object Wrap_ {
    
    inline def apply[E](error: E, errors: FreeSemigroup[DecodeError[E]]): Wrap_[E] = {
      val __obj = js.Dynamic.literal(_tag = "Wrap", error = error.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[Wrap_[E]]
    }
    
    extension [Self <: Wrap_[?], E](x: Self & Wrap_[E]) {
      
      inline def setError(value: E): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: FreeSemigroup[DecodeError[E]]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def set_tag(value: Wrap): Self = StObject.set(x, "_tag", value.asInstanceOf[js.Any])
    }
  }
}
