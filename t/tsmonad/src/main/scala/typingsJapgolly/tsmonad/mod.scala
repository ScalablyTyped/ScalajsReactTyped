package typingsJapgolly.tsmonad

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tsmonad.libSrcEitherMod.EitherType
import typingsJapgolly.tsmonad.libSrcMaybeMod.MaybeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tsmonad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tsmonad", "EitherType")
  @js.native
  object EitherType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.tsmonad.libSrcEitherMod.EitherType & Double] = js.native
    
    /* 0 */ val Left: typingsJapgolly.tsmonad.libSrcEitherMod.EitherType.Left & Double = js.native
    
    /* 1 */ val Right: typingsJapgolly.tsmonad.libSrcEitherMod.EitherType.Right & Double = js.native
  }
  
  @JSImport("tsmonad", "Either")
  @js.native
  open class Either_[L, R] protected ()
    extends typingsJapgolly.tsmonad.libSrcEitherMod.Either_[L, R] {
    def this(`type`: EitherType) = this()
    def this(`type`: EitherType, l: L) = this()
    def this(`type`: EitherType, l: L, r: R) = this()
    def this(`type`: EitherType, l: Unit, r: R) = this()
  }
  /* static members */
  object Either_ {
    
    @JSImport("tsmonad", "Either")
    @js.native
    val ^ : js.Any = js.native
    
    inline def left[L, R](l: L): typingsJapgolly.tsmonad.libSrcEitherMod.Either_[L, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(l.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tsmonad.libSrcEitherMod.Either_[L, R]]
    
    inline def right[L, R](r: R): typingsJapgolly.tsmonad.libSrcEitherMod.Either_[L, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(r.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tsmonad.libSrcEitherMod.Either_[L, R]]
  }
  
  @JSImport("tsmonad", "MaybeType")
  @js.native
  object MaybeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.tsmonad.libSrcMaybeMod.MaybeType & Double] = js.native
    
    /* 1 */ val Just: typingsJapgolly.tsmonad.libSrcMaybeMod.MaybeType.Just & Double = js.native
    
    /* 0 */ val Nothing: typingsJapgolly.tsmonad.libSrcMaybeMod.MaybeType.Nothing & Double = js.native
  }
  
  @JSImport("tsmonad", "Maybe")
  @js.native
  open class Maybe_[T] protected ()
    extends typingsJapgolly.tsmonad.libSrcMaybeMod.Maybe_[T] {
    def this(`type`: MaybeType) = this()
    def this(`type`: MaybeType, value: T) = this()
  }
  /* static members */
  object Maybe_ {
    
    @JSImport("tsmonad", "Maybe")
    @js.native
    val ^ : js.Any = js.native
    
    inline def all(t: StringDictionary[typingsJapgolly.tsmonad.libSrcMaybeMod.Maybe_[Any]]): typingsJapgolly.tsmonad.libSrcMaybeMod.Maybe_[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(t.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tsmonad.libSrcMaybeMod.Maybe_[StringDictionary[Any]]]
    
    inline def isJust[T](t: typingsJapgolly.tsmonad.libSrcMaybeMod.Maybe_[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJust")(t.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isNothing[T](t: typingsJapgolly.tsmonad.libSrcMaybeMod.Maybe_[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNothing")(t.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def just[T](t: T): typingsJapgolly.tsmonad.libSrcMaybeMod.Maybe_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("just")(t.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tsmonad.libSrcMaybeMod.Maybe_[T]]
    
    inline def maybe[T](): typingsJapgolly.tsmonad.libSrcMaybeMod.Maybe_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("maybe")().asInstanceOf[typingsJapgolly.tsmonad.libSrcMaybeMod.Maybe_[T]]
    inline def maybe[T](t: T): typingsJapgolly.tsmonad.libSrcMaybeMod.Maybe_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("maybe")(t.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tsmonad.libSrcMaybeMod.Maybe_[T]]
    
    inline def nothing[T](): typingsJapgolly.tsmonad.libSrcMaybeMod.Maybe_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("nothing")().asInstanceOf[typingsJapgolly.tsmonad.libSrcMaybeMod.Maybe_[T]]
    
    inline def sequence[T](t: StringDictionary[typingsJapgolly.tsmonad.libSrcMaybeMod.Maybe_[T]]): typingsJapgolly.tsmonad.libSrcMaybeMod.Maybe_[StringDictionary[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(t.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tsmonad.libSrcMaybeMod.Maybe_[StringDictionary[T]]]
  }
  
  @JSImport("tsmonad", "Writer")
  @js.native
  open class Writer_[S, T] protected ()
    extends typingsJapgolly.tsmonad.libSrcWriterMod.Writer_[S, T] {
    def this(story: js.Array[S], value: T) = this()
  }
  /* static members */
  object Writer_ {
    
    @JSImport("tsmonad", "Writer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def tell[S](s: S): typingsJapgolly.tsmonad.libSrcWriterMod.Writer_[S, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("tell")(s.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tsmonad.libSrcWriterMod.Writer_[S, Double]]
    
    inline def writer[S, T](story: js.Array[S], value: T): typingsJapgolly.tsmonad.libSrcWriterMod.Writer_[S, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("writer")(story.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.tsmonad.libSrcWriterMod.Writer_[S, T]]
  }
  
  inline def either[L, R](): typingsJapgolly.tsmonad.libSrcEitherMod.Either_[L, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("either")().asInstanceOf[typingsJapgolly.tsmonad.libSrcEitherMod.Either_[L, R]]
  inline def either[L, R](l: L): typingsJapgolly.tsmonad.libSrcEitherMod.Either_[L, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("either")(l.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tsmonad.libSrcEitherMod.Either_[L, R]]
  inline def either[L, R](l: L, r: R): typingsJapgolly.tsmonad.libSrcEitherMod.Either_[L, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("either")(l.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.tsmonad.libSrcEitherMod.Either_[L, R]]
  inline def either[L, R](l: Unit, r: R): typingsJapgolly.tsmonad.libSrcEitherMod.Either_[L, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("either")(l.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.tsmonad.libSrcEitherMod.Either_[L, R]]
  
  inline def eq_(a: Any, b: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def maybe[T](t: T): typingsJapgolly.tsmonad.libSrcMaybeMod.Maybe_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("maybe")(t.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tsmonad.libSrcMaybeMod.Maybe_[T]]
  
  inline def writer[S, T](story: js.Array[S], value: T): typingsJapgolly.tsmonad.libSrcWriterMod.Writer_[S, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("writer")(story.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.tsmonad.libSrcWriterMod.Writer_[S, T]]
}
