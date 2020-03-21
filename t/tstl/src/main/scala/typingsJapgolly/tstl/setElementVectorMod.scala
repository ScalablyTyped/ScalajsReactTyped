package typingsJapgolly.tstl

import typingsJapgolly.tstl.arrayIteratorBaseMod.ArrayIteratorBase
import typingsJapgolly.tstl.arrayReverseIteratorBaseMod.ArrayReverseIteratorBase
import typingsJapgolly.tstl.itreesetMod.ITreeSet
import typingsJapgolly.tstl.setElementVectorMod.SetElementVector.Iterator
import typingsJapgolly.tstl.setElementVectorMod.SetElementVector.ReverseIterator
import typingsJapgolly.tstl.vectorContainerMod.VectorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/associative/SetElementVector", JSImport.Namespace)
@js.native
object setElementVectorMod extends js.Object {
  @js.native
  class SetElementVector[Key, Unique /* <: Boolean */, Source /* <: ITreeSet[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] protected () extends VectorContainer[
          Key, 
          Source, 
          SetElementVector[Key, Unique, Source], 
          Iterator[Key, Unique, Source], 
          ReverseIterator[Key, Unique, Source]
        ] {
    def this(associative: Source) = this()
    var associative_ : js.Any = js.native
  }
  
  @js.native
  object SetElementVector extends js.Object {
    /**
      * Iterator of set container storing elements in a vector.
      *
      * @typeParam Key Key type
      * @typeParam Unique Whether duplicated key is blocked or not
      * @typeParam Source Source container type
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typingsJapgolly.tstl.itreesetMod.ITreeSet.Iterator because var conflicts: value. Inlined  */ @js.native
    class Iterator[Key, Unique /* <: Boolean */, Source /* <: ITreeSet[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] () extends ArrayIteratorBase[
              Key, 
              Source, 
              SetElementVector[Key, Unique, Source], 
              Iterator[Key, Unique, Source], 
              ReverseIterator[Key, Unique, Source], 
              Key
            ]
    
    /**
      * Reverse iterator of set container storing elements in a vector.
      *
      * @typeParam Key Key type
      * @typeParam Unique Whether duplicated key is blocked or not
      * @typeParam Source Source container type
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typingsJapgolly.tstl.itreesetMod.ITreeSet.ReverseIterator because var conflicts: value. Inlined  */ @js.native
    class ReverseIterator[Key, Unique /* <: Boolean */, Source /* <: ITreeSet[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] () extends ArrayReverseIteratorBase[
              Key, 
              Source, 
              SetElementVector[Key, Unique, Source], 
              Iterator[Key, Unique, Source], 
              ReverseIterator[Key, Unique, Source], 
              Key
            ]
    
  }
  
}

