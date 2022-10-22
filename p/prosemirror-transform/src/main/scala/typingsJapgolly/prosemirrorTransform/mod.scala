package typingsJapgolly.prosemirrorTransform

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.prosemirrorModel.mod.Attrs
import typingsJapgolly.prosemirrorModel.mod.ContentMatch
import typingsJapgolly.prosemirrorModel.mod.Fragment
import typingsJapgolly.prosemirrorModel.mod.Mark
import typingsJapgolly.prosemirrorModel.mod.MarkType
import typingsJapgolly.prosemirrorModel.mod.Node
import typingsJapgolly.prosemirrorModel.mod.NodeRange
import typingsJapgolly.prosemirrorModel.mod.NodeType
import typingsJapgolly.prosemirrorModel.mod.Slice
import typingsJapgolly.prosemirrorTransform.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Add a mark to all inline content between two positions.
  */
  @JSImport("prosemirror-transform", "AddMarkStep")
  @js.native
  open class AddMarkStep protected ()
    extends StObject
       with Step {
    /**
      Create a mark step.
      */
    def this(
      /**
      The start of the marked range.
      */
    from: Double,
      /**
      The end of the marked range.
      */
    to: Double,
      /**
      The mark to add.
      */
    mark: Mark
    ) = this()
    
    /**
      Applies this step to the given document, returning a result
      object that either indicates failure, if the step can not be
      applied to this document, or indicates success by containing a
      transformed document.
      */
    /* CompleteClass */
    @JSName("apply")
    override def apply(doc: Node): StepResult = js.native
    
    /**
      The start of the marked range.
      */
    val from: Double = js.native
    
    /**
      Get the step map that represents the changes made by this step,
      and which can be used to transform between positions in the old
      and the new document.
      */
    /* CompleteClass */
    override def getMap(): StepMap = js.native
    
    def invert(): Step = js.native
    /**
      Create an inverted version of this step. Needs the document as it
      was before the step as argument.
      */
    /* CompleteClass */
    override def invert(doc: Node): Step = js.native
    
    /**
      Map this step through a mappable thing, returning either a
      version of that step with its positions adjusted, or `null` if
      the step was entirely deleted by the mapping.
      */
    /* CompleteClass */
    override def map(mapping: Mappable): Step | Null = js.native
    
    /**
      The mark to add.
      */
    val mark: Mark = js.native
    
    /**
      Try to merge this step with another one, to be applied directly
      after it. Returns the merged step when possible, null if the
      steps can't be merged.
      */
    /* CompleteClass */
    override def merge(other: Step): Step | Null = js.native
    
    /**
      The end of the marked range.
      */
    val to: Double = js.native
    
    /**
      Create a JSON-serializeable representation of this step. When
      defining this for a custom subclass, make sure the result object
      includes the step type's [JSON id](https://prosemirror.net/docs/ref/#transform.Step^jsonID) under
      the `stepType` property.
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  /**
  Add a mark to a specific node.
  */
  @JSImport("prosemirror-transform", "AddNodeMarkStep")
  @js.native
  open class AddNodeMarkStep protected ()
    extends StObject
       with Step {
    /**
      Create a node mark step.
      */
    def this(/**
      The position of the target node.
      */
    pos: Double, /**
      The mark to add.
      */
    mark: Mark) = this()
    
    /**
      Applies this step to the given document, returning a result
      object that either indicates failure, if the step can not be
      applied to this document, or indicates success by containing a
      transformed document.
      */
    /* CompleteClass */
    @JSName("apply")
    override def apply(doc: Node): StepResult = js.native
    
    /**
      Get the step map that represents the changes made by this step,
      and which can be used to transform between positions in the old
      and the new document.
      */
    /* CompleteClass */
    override def getMap(): StepMap = js.native
    
    /**
      Create an inverted version of this step. Needs the document as it
      was before the step as argument.
      */
    /* CompleteClass */
    override def invert(doc: Node): Step = js.native
    
    /**
      Map this step through a mappable thing, returning either a
      version of that step with its positions adjusted, or `null` if
      the step was entirely deleted by the mapping.
      */
    /* CompleteClass */
    override def map(mapping: Mappable): Step | Null = js.native
    
    /**
      The mark to add.
      */
    val mark: Mark = js.native
    
    /**
      Try to merge this step with another one, to be applied directly
      after it. Returns the merged step when possible, null if the
      steps can't be merged.
      */
    /* CompleteClass */
    override def merge(other: Step): Step | Null = js.native
    
    /**
      The position of the target node.
      */
    val pos: Double = js.native
    
    /**
      Create a JSON-serializeable representation of this step. When
      defining this for a custom subclass, make sure the result object
      includes the step type's [JSON id](https://prosemirror.net/docs/ref/#transform.Step^jsonID) under
      the `stepType` property.
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  /**
  An object representing a mapped position with extra
  information.
  */
  @JSImport("prosemirror-transform", "MapResult")
  @js.native
  open class MapResult () extends StObject {
    
    /**
      Tells you whether the position was deleted, that is, whether the
      step removed the token on the side queried (via the `assoc`)
      argument from the document.
      */
    def deleted: Boolean = js.native
    
    /**
      Tells whether any of the steps mapped through deletes across the
      position (including both the token before and after the
      position).
      */
    def deletedAcross: Boolean = js.native
    
    /**
      True when the token after the mapped position was deleted.
      */
    def deletedAfter: Boolean = js.native
    
    /**
      Tells you whether the token before the mapped position was deleted.
      */
    def deletedBefore: Boolean = js.native
    
    /**
      The mapped version of the position.
      */
    val pos: Double = js.native
  }
  
  /**
  A mapping represents a pipeline of zero or more [step
  maps](https://prosemirror.net/docs/ref/#transform.StepMap). It has special provisions for losslessly
  handling mapping positions through a series of steps in which some
  steps are inverted versions of earlier steps. (This comes up when
  ‘[rebasing](/docs/guide/#transform.rebasing)’ steps for
  collaboration or history management.)
  */
  @JSImport("prosemirror-transform", "Mapping")
  @js.native
  /**
    Create a new mapping with the given position maps.
    */
  open class Mapping ()
    extends StObject
       with Mappable {
    def this(/**
      The step maps in this mapping.
      */
    maps: js.Array[StepMap]) = this()
    def this(
      /**
      The step maps in this mapping.
      */
    maps: js.Array[StepMap],
      /**
      @internal
      */
    mirror: js.Array[Double]
    ) = this()
    def this(
      /**
      The step maps in this mapping.
      */
    maps: Unit,
      /**
      @internal
      */
    mirror: js.Array[Double]
    ) = this()
    def this(
      /**
      The step maps in this mapping.
      */
    maps: js.Array[StepMap],
      /**
      @internal
      */
    mirror: js.Array[Double],
      /**
      The starting position in the `maps` array, used when `map` or
      `mapResult` is called.
      */
    from: Double
    ) = this()
    def this(
      /**
      The step maps in this mapping.
      */
    maps: js.Array[StepMap],
      /**
      @internal
      */
    mirror: Unit,
      /**
      The starting position in the `maps` array, used when `map` or
      `mapResult` is called.
      */
    from: Double
    ) = this()
    def this(
      /**
      The step maps in this mapping.
      */
    maps: Unit,
      /**
      @internal
      */
    mirror: js.Array[Double],
      /**
      The starting position in the `maps` array, used when `map` or
      `mapResult` is called.
      */
    from: Double
    ) = this()
    def this(
      /**
      The step maps in this mapping.
      */
    maps: Unit,
      /**
      @internal
      */
    mirror: Unit,
      /**
      The starting position in the `maps` array, used when `map` or
      `mapResult` is called.
      */
    from: Double
    ) = this()
    def this(
      /**
      The step maps in this mapping.
      */
    maps: js.Array[StepMap],
      /**
      @internal
      */
    mirror: js.Array[Double],
      /**
      The starting position in the `maps` array, used when `map` or
      `mapResult` is called.
      */
    from: Double,
      /**
      The end position in the `maps` array.
      */
    to: Double
    ) = this()
    def this(
      /**
      The step maps in this mapping.
      */
    maps: js.Array[StepMap],
      /**
      @internal
      */
    mirror: js.Array[Double],
      /**
      The starting position in the `maps` array, used when `map` or
      `mapResult` is called.
      */
    from: Unit,
      /**
      The end position in the `maps` array.
      */
    to: Double
    ) = this()
    def this(
      /**
      The step maps in this mapping.
      */
    maps: js.Array[StepMap],
      /**
      @internal
      */
    mirror: Unit,
      /**
      The starting position in the `maps` array, used when `map` or
      `mapResult` is called.
      */
    from: Double,
      /**
      The end position in the `maps` array.
      */
    to: Double
    ) = this()
    def this(
      /**
      The step maps in this mapping.
      */
    maps: js.Array[StepMap],
      /**
      @internal
      */
    mirror: Unit,
      /**
      The starting position in the `maps` array, used when `map` or
      `mapResult` is called.
      */
    from: Unit,
      /**
      The end position in the `maps` array.
      */
    to: Double
    ) = this()
    def this(
      /**
      The step maps in this mapping.
      */
    maps: Unit,
      /**
      @internal
      */
    mirror: js.Array[Double],
      /**
      The starting position in the `maps` array, used when `map` or
      `mapResult` is called.
      */
    from: Double,
      /**
      The end position in the `maps` array.
      */
    to: Double
    ) = this()
    def this(
      /**
      The step maps in this mapping.
      */
    maps: Unit,
      /**
      @internal
      */
    mirror: js.Array[Double],
      /**
      The starting position in the `maps` array, used when `map` or
      `mapResult` is called.
      */
    from: Unit,
      /**
      The end position in the `maps` array.
      */
    to: Double
    ) = this()
    def this(
      /**
      The step maps in this mapping.
      */
    maps: Unit,
      /**
      @internal
      */
    mirror: Unit,
      /**
      The starting position in the `maps` array, used when `map` or
      `mapResult` is called.
      */
    from: Double,
      /**
      The end position in the `maps` array.
      */
    to: Double
    ) = this()
    def this(
      /**
      The step maps in this mapping.
      */
    maps: Unit,
      /**
      @internal
      */
    mirror: Unit,
      /**
      The starting position in the `maps` array, used when `map` or
      `mapResult` is called.
      */
    from: Unit,
      /**
      The end position in the `maps` array.
      */
    to: Double
    ) = this()
    
    /**
      Add a step map to the end of this mapping. If `mirrors` is
      given, it should be the index of the step map that is the mirror
      image of this one.
      */
    def appendMap(map: StepMap): Unit = js.native
    def appendMap(map: StepMap, mirrors: Double): Unit = js.native
    
    /**
      Add all the step maps in a given mapping to this one (preserving
      mirroring information).
      */
    def appendMapping(mapping: Mapping): Unit = js.native
    
    /**
      Append the inverse of the given mapping to this one.
      */
    def appendMappingInverted(mapping: Mapping): Unit = js.native
    
    /**
      The starting position in the `maps` array, used when `map` or
      `mapResult` is called.
      */
    var from: Double = js.native
    
    /**
      Finds the offset of the step map that mirrors the map at the
      given offset, in this mapping (as per the second argument to
      `appendMap`).
      */
    def getMirror(n: Double): js.UndefOr[Double] = js.native
    
    /**
      Create an inverted version of this mapping.
      */
    def invert(): Mapping = js.native
    
    /**
      The step maps in this mapping.
      */
    val maps: js.Array[StepMap] = js.native
    
    /**
      Create a mapping that maps only through a part of this one.
      */
    def slice(): Mapping = js.native
    def slice(from: Double): Mapping = js.native
    def slice(from: Double, to: Double): Mapping = js.native
    def slice(from: Unit, to: Double): Mapping = js.native
    
    /**
      The end position in the `maps` array.
      */
    var to: Double = js.native
  }
  
  /**
  Remove a mark from all inline content between two positions.
  */
  @JSImport("prosemirror-transform", "RemoveMarkStep")
  @js.native
  open class RemoveMarkStep protected ()
    extends StObject
       with Step {
    /**
      Create a mark-removing step.
      */
    def this(
      /**
      The start of the unmarked range.
      */
    from: Double,
      /**
      The end of the unmarked range.
      */
    to: Double,
      /**
      The mark to remove.
      */
    mark: Mark
    ) = this()
    
    /**
      Applies this step to the given document, returning a result
      object that either indicates failure, if the step can not be
      applied to this document, or indicates success by containing a
      transformed document.
      */
    /* CompleteClass */
    @JSName("apply")
    override def apply(doc: Node): StepResult = js.native
    
    /**
      The start of the unmarked range.
      */
    val from: Double = js.native
    
    /**
      Get the step map that represents the changes made by this step,
      and which can be used to transform between positions in the old
      and the new document.
      */
    /* CompleteClass */
    override def getMap(): StepMap = js.native
    
    def invert(): Step = js.native
    /**
      Create an inverted version of this step. Needs the document as it
      was before the step as argument.
      */
    /* CompleteClass */
    override def invert(doc: Node): Step = js.native
    
    /**
      Map this step through a mappable thing, returning either a
      version of that step with its positions adjusted, or `null` if
      the step was entirely deleted by the mapping.
      */
    /* CompleteClass */
    override def map(mapping: Mappable): Step | Null = js.native
    
    /**
      The mark to remove.
      */
    val mark: Mark = js.native
    
    /**
      Try to merge this step with another one, to be applied directly
      after it. Returns the merged step when possible, null if the
      steps can't be merged.
      */
    /* CompleteClass */
    override def merge(other: Step): Step | Null = js.native
    
    /**
      The end of the unmarked range.
      */
    val to: Double = js.native
    
    /**
      Create a JSON-serializeable representation of this step. When
      defining this for a custom subclass, make sure the result object
      includes the step type's [JSON id](https://prosemirror.net/docs/ref/#transform.Step^jsonID) under
      the `stepType` property.
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  /**
  Remove a mark from a specific node.
  */
  @JSImport("prosemirror-transform", "RemoveNodeMarkStep")
  @js.native
  open class RemoveNodeMarkStep protected ()
    extends StObject
       with Step {
    /**
      Create a mark-removing step.
      */
    def this(/**
      The position of the target node.
      */
    pos: Double, /**
      The mark to remove.
      */
    mark: Mark) = this()
    
    /**
      Applies this step to the given document, returning a result
      object that either indicates failure, if the step can not be
      applied to this document, or indicates success by containing a
      transformed document.
      */
    /* CompleteClass */
    @JSName("apply")
    override def apply(doc: Node): StepResult = js.native
    
    /**
      Get the step map that represents the changes made by this step,
      and which can be used to transform between positions in the old
      and the new document.
      */
    /* CompleteClass */
    override def getMap(): StepMap = js.native
    
    /**
      Create an inverted version of this step. Needs the document as it
      was before the step as argument.
      */
    /* CompleteClass */
    override def invert(doc: Node): Step = js.native
    
    /**
      Map this step through a mappable thing, returning either a
      version of that step with its positions adjusted, or `null` if
      the step was entirely deleted by the mapping.
      */
    /* CompleteClass */
    override def map(mapping: Mappable): Step | Null = js.native
    
    /**
      The mark to remove.
      */
    val mark: Mark = js.native
    
    /**
      Try to merge this step with another one, to be applied directly
      after it. Returns the merged step when possible, null if the
      steps can't be merged.
      */
    /* CompleteClass */
    override def merge(other: Step): Step | Null = js.native
    
    /**
      The position of the target node.
      */
    val pos: Double = js.native
    
    /**
      Create a JSON-serializeable representation of this step. When
      defining this for a custom subclass, make sure the result object
      includes the step type's [JSON id](https://prosemirror.net/docs/ref/#transform.Step^jsonID) under
      the `stepType` property.
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  /**
  Replace a part of the document with a slice of content, but
  preserve a range of the replaced content by moving it into the
  slice.
  */
  @JSImport("prosemirror-transform", "ReplaceAroundStep")
  @js.native
  open class ReplaceAroundStep protected ()
    extends StObject
       with Step {
    /**
      Create a replace-around step with the given range and gap.
      `insert` should be the point in the slice into which the content
      of the gap should be moved. `structure` has the same meaning as
      it has in the [`ReplaceStep`](https://prosemirror.net/docs/ref/#transform.ReplaceStep) class.
      */
    def this(
      /**
      The start position of the replaced range.
      */
    from: Double,
      /**
      The end position of the replaced range.
      */
    to: Double,
      /**
      The start of preserved range.
      */
    gapFrom: Double,
      /**
      The end of preserved range.
      */
    gapTo: Double,
      /**
      The slice to insert.
      */
    slice: Slice,
      /**
      The position in the slice where the preserved range should be
      inserted.
      */
    insert: Double
    ) = this()
    def this(
      /**
      The start position of the replaced range.
      */
    from: Double,
      /**
      The end position of the replaced range.
      */
    to: Double,
      /**
      The start of preserved range.
      */
    gapFrom: Double,
      /**
      The end of preserved range.
      */
    gapTo: Double,
      /**
      The slice to insert.
      */
    slice: Slice,
      /**
      The position in the slice where the preserved range should be
      inserted.
      */
    insert: Double,
      /**
      @internal
      */
    structure: Boolean
    ) = this()
    
    /**
      Applies this step to the given document, returning a result
      object that either indicates failure, if the step can not be
      applied to this document, or indicates success by containing a
      transformed document.
      */
    /* CompleteClass */
    @JSName("apply")
    override def apply(doc: Node): StepResult = js.native
    
    /**
      The start position of the replaced range.
      */
    val from: Double = js.native
    
    /**
      The start of preserved range.
      */
    val gapFrom: Double = js.native
    
    /**
      The end of preserved range.
      */
    val gapTo: Double = js.native
    
    /**
      Get the step map that represents the changes made by this step,
      and which can be used to transform between positions in the old
      and the new document.
      */
    /* CompleteClass */
    override def getMap(): StepMap = js.native
    
    /**
      The position in the slice where the preserved range should be
      inserted.
      */
    val insert: Double = js.native
    
    /**
      Create an inverted version of this step. Needs the document as it
      was before the step as argument.
      */
    /* CompleteClass */
    override def invert(doc: Node): Step = js.native
    
    /**
      Map this step through a mappable thing, returning either a
      version of that step with its positions adjusted, or `null` if
      the step was entirely deleted by the mapping.
      */
    /* CompleteClass */
    override def map(mapping: Mappable): Step | Null = js.native
    
    /**
      Try to merge this step with another one, to be applied directly
      after it. Returns the merged step when possible, null if the
      steps can't be merged.
      */
    /* CompleteClass */
    override def merge(other: Step): Step | Null = js.native
    
    /**
      The slice to insert.
      */
    val slice: Slice = js.native
    
    /**
      The end position of the replaced range.
      */
    val to: Double = js.native
    
    /**
      Create a JSON-serializeable representation of this step. When
      defining this for a custom subclass, make sure the result object
      includes the step type's [JSON id](https://prosemirror.net/docs/ref/#transform.Step^jsonID) under
      the `stepType` property.
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  /**
  Replace a part of the document with a slice of new content.
  */
  @JSImport("prosemirror-transform", "ReplaceStep")
  @js.native
  open class ReplaceStep_ protected ()
    extends StObject
       with Step {
    /**
      The given `slice` should fit the 'gap' between `from` and
      `to`—the depths must line up, and the surrounding nodes must be
      able to be joined with the open sides of the slice. When
      `structure` is true, the step will fail if the content between
      from and to is not just a sequence of closing and then opening
      tokens (this is to guard against rebased replace steps
      overwriting something they weren't supposed to).
      */
    def this(
      /**
      The start position of the replaced range.
      */
    from: Double,
      /**
      The end position of the replaced range.
      */
    to: Double,
      /**
      The slice to insert.
      */
    slice: Slice
    ) = this()
    def this(
      /**
      The start position of the replaced range.
      */
    from: Double,
      /**
      The end position of the replaced range.
      */
    to: Double,
      /**
      The slice to insert.
      */
    slice: Slice,
      /**
      @internal
      */
    structure: Boolean
    ) = this()
    
    /**
      Applies this step to the given document, returning a result
      object that either indicates failure, if the step can not be
      applied to this document, or indicates success by containing a
      transformed document.
      */
    /* CompleteClass */
    @JSName("apply")
    override def apply(doc: Node): StepResult = js.native
    
    /**
      The start position of the replaced range.
      */
    val from: Double = js.native
    
    /**
      Get the step map that represents the changes made by this step,
      and which can be used to transform between positions in the old
      and the new document.
      */
    /* CompleteClass */
    override def getMap(): StepMap = js.native
    
    /**
      Create an inverted version of this step. Needs the document as it
      was before the step as argument.
      */
    /* CompleteClass */
    override def invert(doc: Node): Step = js.native
    
    /**
      Map this step through a mappable thing, returning either a
      version of that step with its positions adjusted, or `null` if
      the step was entirely deleted by the mapping.
      */
    /* CompleteClass */
    override def map(mapping: Mappable): Step | Null = js.native
    
    /**
      Try to merge this step with another one, to be applied directly
      after it. Returns the merged step when possible, null if the
      steps can't be merged.
      */
    /* CompleteClass */
    override def merge(other: Step): Step | Null = js.native
    
    /**
      The slice to insert.
      */
    val slice: Slice = js.native
    
    /**
      The end position of the replaced range.
      */
    val to: Double = js.native
    
    /**
      Create a JSON-serializeable representation of this step. When
      defining this for a custom subclass, make sure the result object
      includes the step type's [JSON id](https://prosemirror.net/docs/ref/#transform.Step^jsonID) under
      the `stepType` property.
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  /**
  Abstraction to build up and track an array of
  [steps](https://prosemirror.net/docs/ref/#transform.Step) representing a document transformation.
  Most transforming methods return the `Transform` object itself, so
  that they can be chained.
  */
  @JSImport("prosemirror-transform", "Transform")
  @js.native
  open class Transform protected () extends StObject {
    /**
      Create a transform that starts with the given document.
      */
    def this(/**
      The current document (the result of applying the steps in the
      transform).
      */
    doc: Node) = this()
    
    /**
      Add the given mark to the inline content between `from` and `to`.
      */
    def addMark(from: Double, to: Double, mark: Mark): this.type = js.native
    
    /**
      Add a mark to the node at position `pos`.
      */
    def addNodeMark(pos: Double, mark: Mark): this.type = js.native
    
    /**
      The starting document.
      */
    def before: Node = js.native
    
    /**
      Removes all marks and nodes from the content of the node at
      `pos` that don't match the given new parent node type. Accepts
      an optional starting [content match](https://prosemirror.net/docs/ref/#model.ContentMatch) as
      third argument.
      */
    def clearIncompatible(pos: Double, parentType: NodeType): this.type = js.native
    def clearIncompatible(pos: Double, parentType: NodeType, `match`: ContentMatch): this.type = js.native
    
    /**
      Delete the content between the given positions.
      */
    def delete(from: Double, to: Double): this.type = js.native
    
    /**
      Delete the given range, expanding it to cover fully covered
      parent nodes until a valid replace is found.
      */
    def deleteRange(from: Double, to: Double): this.type = js.native
    
    /**
      The current document (the result of applying the steps in the
      transform).
      */
    var doc: Node = js.native
    
    /**
      True when the document has been changed (when there are any
      steps).
      */
    def docChanged: Boolean = js.native
    
    /**
      The documents before each of the steps.
      */
    val docs: js.Array[Node] = js.native
    
    def insert(pos: Double, content: js.Array[Node]): this.type = js.native
    /**
      Insert the given content at the given position.
      */
    def insert(pos: Double, content: Fragment): this.type = js.native
    def insert(pos: Double, content: Node): this.type = js.native
    
    /**
      Join the blocks around the given position. If depth is 2, their
      last and first siblings are also joined, and so on.
      */
    def join(pos: Double): this.type = js.native
    def join(pos: Double, depth: Double): this.type = js.native
    
    /**
      Split the content in the given range off from its parent, if there
      is sibling content before or after it, and move it up the tree to
      the depth specified by `target`. You'll probably want to use
      [`liftTarget`](https://prosemirror.net/docs/ref/#transform.liftTarget) to compute `target`, to make
      sure the lift is valid.
      */
    def lift(range: NodeRange, target: Double): this.type = js.native
    
    /**
      A mapping with the maps for each of the steps in this transform.
      */
    val mapping: Mapping = js.native
    
    /**
      Try to apply a step in this transformation, ignoring it if it
      fails. Returns the step result.
      */
    def maybeStep(step: Step): StepResult = js.native
    
    /**
      Remove marks from inline nodes between `from` and `to`. When
      `mark` is a single mark, remove precisely that mark. When it is
      a mark type, remove all marks of that type. When it is null,
      remove all marks of any type.
      */
    def removeMark(from: Double, to: Double): this.type = js.native
    def removeMark(from: Double, to: Double, mark: Mark): this.type = js.native
    def removeMark(from: Double, to: Double, mark: MarkType): this.type = js.native
    
    /**
      Remove a mark (or a mark of the given type) from the node at
      position `pos`.
      */
    def removeNodeMark(pos: Double, mark: Mark): this.type = js.native
    def removeNodeMark(pos: Double, mark: MarkType): this.type = js.native
    
    /**
      Replace the part of the document between `from` and `to` with the
      given `slice`.
      */
    def replace(from: Double): this.type = js.native
    def replace(from: Double, to: Double): this.type = js.native
    def replace(from: Double, to: Double, slice: Slice): this.type = js.native
    def replace(from: Double, to: Unit, slice: Slice): this.type = js.native
    
    /**
      Replace a range of the document with a given slice, using
      `from`, `to`, and the slice's
      [`openStart`](https://prosemirror.net/docs/ref/#model.Slice.openStart) property as hints, rather
      than fixed start and end points. This method may grow the
      replaced area or close open nodes in the slice in order to get a
      fit that is more in line with WYSIWYG expectations, by dropping
      fully covered parent nodes of the replaced region when they are
      marked [non-defining as
      context](https://prosemirror.net/docs/ref/#model.NodeSpec.definingAsContext), or including an
      open parent node from the slice that _is_ marked as [defining
      its content](https://prosemirror.net/docs/ref/#model.NodeSpec.definingForContent).
      
      This is the method, for example, to handle paste. The similar
      [`replace`](https://prosemirror.net/docs/ref/#transform.Transform.replace) method is a more
      primitive tool which will _not_ move the start and end of its given
      range, and is useful in situations where you need more precise
      control over what happens.
      */
    def replaceRange(from: Double, to: Double, slice: Slice): this.type = js.native
    
    /**
      Replace the given range with a node, but use `from` and `to` as
      hints, rather than precise positions. When from and to are the same
      and are at the start or end of a parent node in which the given
      node doesn't fit, this method may _move_ them out towards a parent
      that does allow the given node to be placed. When the given range
      completely covers a parent node, this method may completely replace
      that parent node.
      */
    def replaceRangeWith(from: Double, to: Double, node: Node): this.type = js.native
    
    def replaceWith(from: Double, to: Double, content: js.Array[Node]): this.type = js.native
    /**
      Replace the given range with the given content, which may be a
      fragment, node, or array of nodes.
      */
    def replaceWith(from: Double, to: Double, content: Fragment): this.type = js.native
    def replaceWith(from: Double, to: Double, content: Node): this.type = js.native
    
    /**
      Set the type of all textblocks (partly) between `from` and `to` to
      the given node type with the given attributes.
      */
    def setBlockType(from: Double, to: Double, `type`: NodeType): this.type = js.native
    def setBlockType(from: Double, to: Double, `type`: NodeType, attrs: Attrs): this.type = js.native
    def setBlockType(from: Double, to: Unit, `type`: NodeType): this.type = js.native
    def setBlockType(from: Double, to: Unit, `type`: NodeType, attrs: Attrs): this.type = js.native
    
    /**
      Set a single attribute on a given node to a new value.
      */
    def setNodeAttribute(pos: Double, attr: String, value: Any): this.type = js.native
    
    /**
      Change the type, attributes, and/or marks of the node at `pos`.
      When `type` isn't given, the existing node type is preserved,
      */
    def setNodeMarkup(pos: Double): this.type = js.native
    def setNodeMarkup(pos: Double, `type`: Null, attrs: Null, marks: js.Array[Mark]): this.type = js.native
    def setNodeMarkup(pos: Double, `type`: Null, attrs: Unit, marks: js.Array[Mark]): this.type = js.native
    def setNodeMarkup(pos: Double, `type`: Null, attrs: Attrs): this.type = js.native
    def setNodeMarkup(pos: Double, `type`: Null, attrs: Attrs, marks: js.Array[Mark]): this.type = js.native
    def setNodeMarkup(pos: Double, `type`: Unit, attrs: Null, marks: js.Array[Mark]): this.type = js.native
    def setNodeMarkup(pos: Double, `type`: Unit, attrs: Unit, marks: js.Array[Mark]): this.type = js.native
    def setNodeMarkup(pos: Double, `type`: Unit, attrs: Attrs): this.type = js.native
    def setNodeMarkup(pos: Double, `type`: Unit, attrs: Attrs, marks: js.Array[Mark]): this.type = js.native
    def setNodeMarkup(pos: Double, `type`: NodeType): this.type = js.native
    def setNodeMarkup(pos: Double, `type`: NodeType, attrs: Null, marks: js.Array[Mark]): this.type = js.native
    def setNodeMarkup(pos: Double, `type`: NodeType, attrs: Unit, marks: js.Array[Mark]): this.type = js.native
    def setNodeMarkup(pos: Double, `type`: NodeType, attrs: Attrs): this.type = js.native
    def setNodeMarkup(pos: Double, `type`: NodeType, attrs: Attrs, marks: js.Array[Mark]): this.type = js.native
    
    /**
      Split the node at the given position, and optionally, if `depth` is
      greater than one, any number of nodes above that. By default, the
      parts split off will inherit the node type of the original node.
      This can be changed by passing an array of types and attributes to
      use after the split.
      */
    def split(pos: Double): this.type = js.native
    def split(pos: Double, depth: Double): this.type = js.native
    def split(
      pos: Double,
      depth: Double,
      typesAfter: js.Array[Null | typingsJapgolly.prosemirrorTransform.anon.Attrs]
    ): this.type = js.native
    def split(
      pos: Double,
      depth: Unit,
      typesAfter: js.Array[Null | typingsJapgolly.prosemirrorTransform.anon.Attrs]
    ): this.type = js.native
    
    /**
      Apply a new step in this transform, saving the result. Throws an
      error when the step fails.
      */
    def step(step: Step): this.type = js.native
    
    /**
      The steps in this transform.
      */
    val steps: js.Array[Step] = js.native
    
    /**
      Wrap the given [range](https://prosemirror.net/docs/ref/#model.NodeRange) in the given set of wrappers.
      The wrappers are assumed to be valid in this position, and should
      probably be computed with [`findWrapping`](https://prosemirror.net/docs/ref/#transform.findWrapping).
      */
    def wrap(range: NodeRange, wrappers: js.Array[typingsJapgolly.prosemirrorTransform.anon.Attrs]): this.type = js.native
  }
  
  /**
  Test whether the blocks before and after a given position can be
  joined.
  */
  inline def canJoin(doc: Node, pos: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canJoin")(doc.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
  Check whether splitting at the given position is allowed.
  */
  inline def canSplit(doc: Node, pos: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canSplit")(doc.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def canSplit(doc: Node, pos: Double, depth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canSplit")(doc.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def canSplit(
    doc: Node,
    pos: Double,
    depth: Double,
    typesAfter: js.Array[Null | typingsJapgolly.prosemirrorTransform.anon.Attrs]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canSplit")(doc.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], typesAfter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def canSplit(
    doc: Node,
    pos: Double,
    depth: Unit,
    typesAfter: js.Array[Null | typingsJapgolly.prosemirrorTransform.anon.Attrs]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canSplit")(doc.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], typesAfter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
  Finds a position at or around the given position where the given
  slice can be inserted. Will look at parent nodes' nearest boundary
  and try there, even if the original position wasn't directly at the
  start or end of that node. Returns null when no position was found.
  */
  inline def dropPoint(doc: Node, pos: Double, slice: Slice): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("dropPoint")(doc.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], slice.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  /**
  Try to find a valid way to wrap the content in the given range in a
  node of the given type. May introduce extra nodes around and inside
  the wrapper node, if necessary. Returns null if no valid wrapping
  could be found. When `innerRange` is given, that range's content is
  used as the content to fit into the wrapping, instead of the
  content of `range`.
  */
  inline def findWrapping(range: NodeRange, nodeType: NodeType): js.Array[Type] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findWrapping")(range.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any])).asInstanceOf[js.Array[Type] | Null]
  inline def findWrapping(range: NodeRange, nodeType: NodeType, attrs: Null, innerRange: NodeRange): js.Array[Type] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findWrapping")(range.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], innerRange.asInstanceOf[js.Any])).asInstanceOf[js.Array[Type] | Null]
  inline def findWrapping(range: NodeRange, nodeType: NodeType, attrs: Unit, innerRange: NodeRange): js.Array[Type] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findWrapping")(range.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], innerRange.asInstanceOf[js.Any])).asInstanceOf[js.Array[Type] | Null]
  inline def findWrapping(range: NodeRange, nodeType: NodeType, attrs: Attrs): js.Array[Type] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findWrapping")(range.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[js.Array[Type] | Null]
  inline def findWrapping(range: NodeRange, nodeType: NodeType, attrs: Attrs, innerRange: NodeRange): js.Array[Type] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findWrapping")(range.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], innerRange.asInstanceOf[js.Any])).asInstanceOf[js.Array[Type] | Null]
  
  /**
  Try to find a point where a node of the given type can be inserted
  near `pos`, by searching up the node hierarchy when `pos` itself
  isn't a valid place but is at the start or end of a node. Return
  null if no position was found.
  */
  inline def insertPoint(doc: Node, pos: Double, nodeType: NodeType): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("insertPoint")(doc.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], nodeType.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  /**
  Find an ancestor of the given position that can be joined to the
  block before (or after if `dir` is positive). Returns the joinable
  point, if any.
  */
  inline def joinPoint(doc: Node, pos: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("joinPoint")(doc.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  inline def joinPoint(doc: Node, pos: Double, dir: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("joinPoint")(doc.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  /**
  Try to find a target depth to which the content in the given range
  can be lifted. Will not go across
  [isolating](https://prosemirror.net/docs/ref/#model.NodeSpec.isolating) parent nodes.
  */
  inline def liftTarget(range: NodeRange): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("liftTarget")(range.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  
  /**
  ‘Fit’ a slice into a given position in the document, producing a
  [step](https://prosemirror.net/docs/ref/#transform.Step) that inserts it. Will return null if
  there's no meaningful way to insert the slice here, or inserting it
  would be a no-op (an empty slice over an empty range).
  */
  inline def replaceStep(doc: Node, from: Double): Step | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStep")(doc.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[Step | Null]
  inline def replaceStep(doc: Node, from: Double, to: Double): Step | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStep")(doc.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Step | Null]
  inline def replaceStep(doc: Node, from: Double, to: Double, slice: Slice): Step | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStep")(doc.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], slice.asInstanceOf[js.Any])).asInstanceOf[Step | Null]
  inline def replaceStep(doc: Node, from: Double, to: Unit, slice: Slice): Step | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStep")(doc.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], slice.asInstanceOf[js.Any])).asInstanceOf[Step | Null]
  
  /**
  Update an attribute in a specific node.
  */
  trait AttrStep
    extends StObject
       with Step {
    
    /**
      The attribute to set.
      */
    val attr: String
    
    /**
      The position of the target node.
      */
    val pos: Double
    
    val value: Any
  }
  object AttrStep {
    
    inline def apply(
      apply: Node => StepResult,
      attr: String,
      getMap: CallbackTo[StepMap],
      invert: Node => Step,
      map: Mappable => Step | Null,
      merge: Step => Step | Null,
      pos: Double,
      toJSON: CallbackTo[Any],
      value: Any
    ): AttrStep = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), attr = attr.asInstanceOf[js.Any], getMap = getMap.toJsFn, invert = js.Any.fromFunction1(invert), map = js.Any.fromFunction1(map), merge = js.Any.fromFunction1(merge), pos = pos.asInstanceOf[js.Any], toJSON = toJSON.toJsFn, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttrStep]
    }
    
    extension [Self <: AttrStep](x: Self) {
      
      inline def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
  There are several things that positions can be mapped through.
  Such objects conform to this interface.
  */
  @js.native
  trait Mappable extends StObject {
    
    /**
      Map a position through this object. When given, `assoc` (should
      be -1 or 1, defaults to 1) determines with which side the
      position is associated, which determines in which direction to
      move when a chunk of content is inserted at the mapped position.
      */
    def map(pos: Double): Double = js.native
    def map(pos: Double, assoc: Double): Double = js.native
    
    /**
      Map a position, and return an object containing additional
      information about the mapping. The result's `deleted` field tells
      you whether the position was deleted (completely enclosed in a
      replaced range) during the mapping. When content on only one side
      is deleted, the position itself is only considered deleted when
      `assoc` points in the direction of the deleted content.
      */
    def mapResult(pos: Double): MapResult = js.native
    def mapResult(pos: Double, assoc: Double): MapResult = js.native
  }
  
  /**
  A step object represents an atomic change. It generally applies
  only to the document it was created for, since the positions
  stored in it will only make sense for that document.
  New steps are defined by creating classes that extend `Step`,
  overriding the `apply`, `invert`, `map`, `getMap` and `fromJSON`
  methods, and registering your class with a unique
  JSON-serialization identifier using
  [`Step.jsonID`](https://prosemirror.net/docs/ref/#transform.Step^jsonID).
  */
  trait Step extends StObject {
    
    /**
      Applies this step to the given document, returning a result
      object that either indicates failure, if the step can not be
      applied to this document, or indicates success by containing a
      transformed document.
      */
    @JSName("apply")
    def apply(doc: Node): StepResult
    
    /**
      Get the step map that represents the changes made by this step,
      and which can be used to transform between positions in the old
      and the new document.
      */
    def getMap(): StepMap
    
    /**
      Create an inverted version of this step. Needs the document as it
      was before the step as argument.
      */
    def invert(doc: Node): Step
    
    /**
      Map this step through a mappable thing, returning either a
      version of that step with its positions adjusted, or `null` if
      the step was entirely deleted by the mapping.
      */
    def map(mapping: Mappable): Step | Null
    
    /**
      Try to merge this step with another one, to be applied directly
      after it. Returns the merged step when possible, null if the
      steps can't be merged.
      */
    def merge(other: Step): Step | Null
    
    /**
      Create a JSON-serializeable representation of this step. When
      defining this for a custom subclass, make sure the result object
      includes the step type's [JSON id](https://prosemirror.net/docs/ref/#transform.Step^jsonID) under
      the `stepType` property.
      */
    def toJSON(): Any
  }
  object Step {
    
    inline def apply(
      apply: Node => StepResult,
      getMap: CallbackTo[StepMap],
      invert: Node => Step,
      map: Mappable => Step | Null,
      merge: Step => Step | Null,
      toJSON: CallbackTo[Any]
    ): Step = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), getMap = getMap.toJsFn, invert = js.Any.fromFunction1(invert), map = js.Any.fromFunction1(map), merge = js.Any.fromFunction1(merge), toJSON = toJSON.toJsFn)
      __obj.asInstanceOf[Step]
    }
    
    extension [Self <: Step](x: Self) {
      
      inline def setApply(value: Node => StepResult): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setGetMap(value: CallbackTo[StepMap]): Self = StObject.set(x, "getMap", value.toJsFn)
      
      inline def setInvert(value: Node => Step): Self = StObject.set(x, "invert", js.Any.fromFunction1(value))
      
      inline def setMap(value: Mappable => Step | Null): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setMerge(value: Step => Step | Null): Self = StObject.set(x, "merge", js.Any.fromFunction1(value))
      
      inline def setToJSON(value: CallbackTo[Any]): Self = StObject.set(x, "toJSON", value.toJsFn)
    }
  }
  
  /**
  A map describing the deletions and insertions made by a step, which
  can be used to find the correspondence between positions in the
  pre-step version of a document and the same position in the
  post-step version.
  */
  @js.native
  trait StepMap
    extends StObject
       with Mappable {
    
    /**
      Calls the given function on each of the changed ranges included in
      this map.
      */
    def forEach(
      f: js.Function4[
          /* oldStart */ Double, 
          /* oldEnd */ Double, 
          /* newStart */ Double, 
          /* newEnd */ Double, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      Create an inverted version of this map. The result can be used to
      map positions in the post-step document to the pre-step document.
      */
    def invert(): StepMap = js.native
  }
  
  /**
  The result of [applying](https://prosemirror.net/docs/ref/#transform.Step.apply) a step. Contains either a
  new document or a failure value.
  */
  trait StepResult extends StObject {
    
    /**
      The transformed document, if successful.
      */
    val doc: Node | Null
    
    /**
      The failure message, if unsuccessful.
      */
    val failed: String | Null
  }
  object StepResult {
    
    inline def apply(): StepResult = {
      val __obj = js.Dynamic.literal(doc = null, failed = null)
      __obj.asInstanceOf[StepResult]
    }
    
    extension [Self <: StepResult](x: Self) {
      
      inline def setDoc(value: Node): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      inline def setDocNull: Self = StObject.set(x, "doc", null)
      
      inline def setFailed(value: String): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      inline def setFailedNull: Self = StObject.set(x, "failed", null)
    }
  }
}
