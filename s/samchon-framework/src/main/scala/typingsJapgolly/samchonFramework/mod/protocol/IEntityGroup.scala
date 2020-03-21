package typingsJapgolly.samchonFramework.mod.protocol

import typingsJapgolly.sxml.mod.XML
import typingsJapgolly.tstl.mod.base.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon-framework", "protocol.IEntityGroup")
@js.native
object IEntityGroup extends js.Object {
  /**
    * @hidden
    */
  def construct[T /* <: typingsJapgolly.samchon.ientityMod.IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: js.Iterator[T] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
    entityGroup: typingsJapgolly.samchon.ientitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
    xml: XML,
    prohibited_names: String*
  ): Unit = js.native
  def count[T /* <: typingsJapgolly.samchon.ientityMod.IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: js.Iterator[T] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
    entityGroup: typingsJapgolly.samchon.ientitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
    key: js.Any
  ): Double = js.native
  def get[T /* <: typingsJapgolly.samchon.ientityMod.IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: js.Iterator[T] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
    entityGroup: typingsJapgolly.samchon.ientitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
    key: js.Any
  ): T = js.native
  def has[T /* <: typingsJapgolly.samchon.ientityMod.IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: js.Iterator[T] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
    entityGroup: typingsJapgolly.samchon.ientitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
    key: js.Any
  ): Boolean = js.native
  /**
    * @hidden
    */
  def toXML[T /* <: typingsJapgolly.samchon.ientityMod.IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: js.Iterator[T] */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
    group: typingsJapgolly.samchon.ientitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
    prohibited_names: String*
  ): XML = js.native
}

