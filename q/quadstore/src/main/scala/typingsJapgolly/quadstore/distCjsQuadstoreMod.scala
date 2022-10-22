package typingsJapgolly.quadstore

import typingsJapgolly.abstractLevel.mod.AbstractLevel
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.quadstore.distCjsScopeMod.Scope
import typingsJapgolly.quadstore.distCjsTypesMod.ApproximateSizeResult
import typingsJapgolly.quadstore.distCjsTypesMod.DelOpts
import typingsJapgolly.quadstore.distCjsTypesMod.DelStreamOpts
import typingsJapgolly.quadstore.distCjsTypesMod.GetOpts
import typingsJapgolly.quadstore.distCjsTypesMod.InternalIndex
import typingsJapgolly.quadstore.distCjsTypesMod.PatchOpts
import typingsJapgolly.quadstore.distCjsTypesMod.Pattern
import typingsJapgolly.quadstore.distCjsTypesMod.Prefixes
import typingsJapgolly.quadstore.distCjsTypesMod.PutOpts
import typingsJapgolly.quadstore.distCjsTypesMod.PutStreamOpts
import typingsJapgolly.quadstore.distCjsTypesMod.QuadArrayResultWithInternals
import typingsJapgolly.quadstore.distCjsTypesMod.QuadStreamResultWithInternals
import typingsJapgolly.quadstore.distCjsTypesMod.StoreOpts
import typingsJapgolly.quadstore.distCjsTypesMod.TSReadable
import typingsJapgolly.quadstore.distCjsTypesMod.TermName
import typingsJapgolly.quadstore.distCjsTypesMod.VoidResult
import typingsJapgolly.rdfjsTypes.dataModelMod.DataFactory
import typingsJapgolly.rdfjsTypes.dataModelMod.Quad
import typingsJapgolly.rdfjsTypes.dataModelMod.QuadGraph
import typingsJapgolly.rdfjsTypes.dataModelMod.QuadObject
import typingsJapgolly.rdfjsTypes.dataModelMod.QuadPredicate
import typingsJapgolly.rdfjsTypes.dataModelMod.QuadSubject
import typingsJapgolly.rdfjsTypes.dataModelMod.Term
import typingsJapgolly.rdfjsTypes.streamMod.Store
import typingsJapgolly.rdfjsTypes.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsQuadstoreMod {
  
  @JSImport("quadstore/dist/cjs/quadstore", "Quadstore")
  @js.native
  open class Quadstore protected ()
    extends StObject
       with Store[Quad] {
    def this(opts: StoreOpts) = this()
    
    def _addIndex(terms: js.Array[TermName]): Unit = js.native
    
    /* private */ var _batchDel: Any = js.native
    
    /* private */ var _batchPut: Any = js.native
    
    def clear(): js.Promise[Unit] = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def countQuads(): js.Promise[Double] = js.native
    def countQuads(subject: Unit, predicate: Unit, `object`: Unit, graph: Unit, opts: GetOpts): js.Promise[Double] = js.native
    def countQuads(subject: Unit, predicate: Unit, `object`: Unit, graph: QuadGraph): js.Promise[Double] = js.native
    def countQuads(subject: Unit, predicate: Unit, `object`: Unit, graph: QuadGraph, opts: GetOpts): js.Promise[Double] = js.native
    def countQuads(subject: Unit, predicate: Unit, `object`: QuadObject): js.Promise[Double] = js.native
    def countQuads(subject: Unit, predicate: Unit, `object`: QuadObject, graph: Unit, opts: GetOpts): js.Promise[Double] = js.native
    def countQuads(subject: Unit, predicate: Unit, `object`: QuadObject, graph: QuadGraph): js.Promise[Double] = js.native
    def countQuads(subject: Unit, predicate: Unit, `object`: QuadObject, graph: QuadGraph, opts: GetOpts): js.Promise[Double] = js.native
    def countQuads(subject: Unit, predicate: QuadPredicate): js.Promise[Double] = js.native
    def countQuads(subject: Unit, predicate: QuadPredicate, `object`: Unit, graph: Unit, opts: GetOpts): js.Promise[Double] = js.native
    def countQuads(subject: Unit, predicate: QuadPredicate, `object`: Unit, graph: QuadGraph): js.Promise[Double] = js.native
    def countQuads(subject: Unit, predicate: QuadPredicate, `object`: Unit, graph: QuadGraph, opts: GetOpts): js.Promise[Double] = js.native
    def countQuads(subject: Unit, predicate: QuadPredicate, `object`: QuadObject): js.Promise[Double] = js.native
    def countQuads(subject: Unit, predicate: QuadPredicate, `object`: QuadObject, graph: Unit, opts: GetOpts): js.Promise[Double] = js.native
    def countQuads(subject: Unit, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): js.Promise[Double] = js.native
    def countQuads(subject: Unit, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph, opts: GetOpts): js.Promise[Double] = js.native
    def countQuads(subject: QuadSubject): js.Promise[Double] = js.native
    def countQuads(subject: QuadSubject, predicate: Unit, `object`: Unit, graph: Unit, opts: GetOpts): js.Promise[Double] = js.native
    def countQuads(subject: QuadSubject, predicate: Unit, `object`: Unit, graph: QuadGraph): js.Promise[Double] = js.native
    def countQuads(subject: QuadSubject, predicate: Unit, `object`: Unit, graph: QuadGraph, opts: GetOpts): js.Promise[Double] = js.native
    def countQuads(subject: QuadSubject, predicate: Unit, `object`: QuadObject): js.Promise[Double] = js.native
    def countQuads(subject: QuadSubject, predicate: Unit, `object`: QuadObject, graph: Unit, opts: GetOpts): js.Promise[Double] = js.native
    def countQuads(subject: QuadSubject, predicate: Unit, `object`: QuadObject, graph: QuadGraph): js.Promise[Double] = js.native
    def countQuads(subject: QuadSubject, predicate: Unit, `object`: QuadObject, graph: QuadGraph, opts: GetOpts): js.Promise[Double] = js.native
    def countQuads(subject: QuadSubject, predicate: QuadPredicate): js.Promise[Double] = js.native
    def countQuads(subject: QuadSubject, predicate: QuadPredicate, `object`: Unit, graph: Unit, opts: GetOpts): js.Promise[Double] = js.native
    def countQuads(subject: QuadSubject, predicate: QuadPredicate, `object`: Unit, graph: QuadGraph): js.Promise[Double] = js.native
    def countQuads(subject: QuadSubject, predicate: QuadPredicate, `object`: Unit, graph: QuadGraph, opts: GetOpts): js.Promise[Double] = js.native
    def countQuads(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): js.Promise[Double] = js.native
    def countQuads(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: Unit, opts: GetOpts): js.Promise[Double] = js.native
    def countQuads(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): js.Promise[Double] = js.native
    def countQuads(
      subject: QuadSubject,
      predicate: QuadPredicate,
      `object`: QuadObject,
      graph: QuadGraph,
      opts: GetOpts
    ): js.Promise[Double] = js.native
    
    val dataFactory: DataFactory[Quad, Quad] = js.native
    
    val db: AbstractLevel[Any, Any, Any] = js.native
    
    def del(quad: Quad): js.Promise[VoidResult] = js.native
    def del(quad: Quad, opts: DelOpts): js.Promise[VoidResult] = js.native
    
    def delStream(source: TSReadable[Quad]): js.Promise[VoidResult] = js.native
    def delStream(source: TSReadable[Quad], opts: DelStreamOpts): js.Promise[VoidResult] = js.native
    
    def deleteAllScopes(): js.Promise[Unit] = js.native
    
    def deleteGraph(graph: QuadGraph): EventEmitter = js.native
    
    def deleteScope(scopeId: String): js.Promise[Unit] = js.native
    
    /* protected */ def ensureReady(): Unit = js.native
    
    def get(pattern: Pattern): js.Promise[QuadArrayResultWithInternals] = js.native
    def get(pattern: Pattern, opts: GetOpts): js.Promise[QuadArrayResultWithInternals] = js.native
    
    def getApproximateSize(pattern: Pattern): js.Promise[ApproximateSizeResult] = js.native
    def getApproximateSize(pattern: Pattern, opts: GetOpts): js.Promise[ApproximateSizeResult] = js.native
    
    def getStream(pattern: Pattern): js.Promise[QuadStreamResultWithInternals] = js.native
    def getStream(pattern: Pattern, opts: GetOpts): js.Promise[QuadStreamResultWithInternals] = js.native
    
    val id: String = js.native
    
    /**
      * Consumes the given stream.
      *
      * The `end` and `error` events are used like described in the Stream interface.
      * Depending on the use case, subtypes of EventEmitter or Stream are used.
      * @see Stream
      *
      * @param stream The stream that will be consumed.
      * @return The resulting event emitter.
      */
    /* CompleteClass */
    override def `import`(stream: Stream[Quad]): EventEmitter = js.native
    
    val indexes: js.Array[InternalIndex] = js.native
    
    def initScope(): js.Promise[Scope] = js.native
    
    def loadScope(scopeId: String): js.Promise[Scope] = js.native
    
    def `match`(): Stream[Quad] = js.native
    /**
      * Returns a stream that processes all quads matching the pattern.
      *
      * @param subject   The optional subject.
      * @param predicate The optional predicate.
      * @param object    The optional object.
      * @param graph     The optional graph.
      * @return The resulting quad stream.
      */
    /* CompleteClass */
    override def `match`(
      subject: js.UndefOr[Term | Null],
      predicate: js.UndefOr[Term | Null],
      `object`: js.UndefOr[Term | Null],
      graph: js.UndefOr[Term | Null]
    ): Stream[Quad] = js.native
    def `match`(subject: Unit, predicate: Unit, `object`: Unit, graph: Unit, opts: GetOpts): Stream[Quad] = js.native
    def `match`(subject: Unit, predicate: Unit, `object`: Unit, graph: QuadGraph): Stream[Quad] = js.native
    def `match`(subject: Unit, predicate: Unit, `object`: Unit, graph: QuadGraph, opts: GetOpts): Stream[Quad] = js.native
    def `match`(subject: Unit, predicate: Unit, `object`: QuadObject): Stream[Quad] = js.native
    def `match`(subject: Unit, predicate: Unit, `object`: QuadObject, graph: Unit, opts: GetOpts): Stream[Quad] = js.native
    def `match`(subject: Unit, predicate: Unit, `object`: QuadObject, graph: QuadGraph): Stream[Quad] = js.native
    def `match`(subject: Unit, predicate: Unit, `object`: QuadObject, graph: QuadGraph, opts: GetOpts): Stream[Quad] = js.native
    def `match`(subject: Unit, predicate: QuadPredicate): Stream[Quad] = js.native
    def `match`(subject: Unit, predicate: QuadPredicate, `object`: Unit, graph: Unit, opts: GetOpts): Stream[Quad] = js.native
    def `match`(subject: Unit, predicate: QuadPredicate, `object`: Unit, graph: QuadGraph): Stream[Quad] = js.native
    def `match`(subject: Unit, predicate: QuadPredicate, `object`: Unit, graph: QuadGraph, opts: GetOpts): Stream[Quad] = js.native
    def `match`(subject: Unit, predicate: QuadPredicate, `object`: QuadObject): Stream[Quad] = js.native
    def `match`(subject: Unit, predicate: QuadPredicate, `object`: QuadObject, graph: Unit, opts: GetOpts): Stream[Quad] = js.native
    def `match`(subject: Unit, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): Stream[Quad] = js.native
    def `match`(subject: Unit, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph, opts: GetOpts): Stream[Quad] = js.native
    def `match`(subject: QuadSubject): Stream[Quad] = js.native
    def `match`(subject: QuadSubject, predicate: Unit, `object`: Unit, graph: Unit, opts: GetOpts): Stream[Quad] = js.native
    def `match`(subject: QuadSubject, predicate: Unit, `object`: Unit, graph: QuadGraph): Stream[Quad] = js.native
    def `match`(subject: QuadSubject, predicate: Unit, `object`: Unit, graph: QuadGraph, opts: GetOpts): Stream[Quad] = js.native
    def `match`(subject: QuadSubject, predicate: Unit, `object`: QuadObject): Stream[Quad] = js.native
    def `match`(subject: QuadSubject, predicate: Unit, `object`: QuadObject, graph: Unit, opts: GetOpts): Stream[Quad] = js.native
    def `match`(subject: QuadSubject, predicate: Unit, `object`: QuadObject, graph: QuadGraph): Stream[Quad] = js.native
    def `match`(subject: QuadSubject, predicate: Unit, `object`: QuadObject, graph: QuadGraph, opts: GetOpts): Stream[Quad] = js.native
    def `match`(subject: QuadSubject, predicate: QuadPredicate): Stream[Quad] = js.native
    def `match`(subject: QuadSubject, predicate: QuadPredicate, `object`: Unit, graph: Unit, opts: GetOpts): Stream[Quad] = js.native
    def `match`(subject: QuadSubject, predicate: QuadPredicate, `object`: Unit, graph: QuadGraph): Stream[Quad] = js.native
    def `match`(subject: QuadSubject, predicate: QuadPredicate, `object`: Unit, graph: QuadGraph, opts: GetOpts): Stream[Quad] = js.native
    def `match`(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): Stream[Quad] = js.native
    def `match`(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: Unit, opts: GetOpts): Stream[Quad] = js.native
    def `match`(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): Stream[Quad] = js.native
    def `match`(
      subject: QuadSubject,
      predicate: QuadPredicate,
      `object`: QuadObject,
      graph: QuadGraph,
      opts: GetOpts
    ): Stream[Quad] = js.native
    
    def multiDel(quads: js.Array[Quad]): js.Promise[VoidResult] = js.native
    def multiDel(quads: js.Array[Quad], opts: DelOpts): js.Promise[VoidResult] = js.native
    
    def multiPatch(oldQuads: js.Array[Quad], newQuads: js.Array[Quad]): js.Promise[VoidResult] = js.native
    def multiPatch(oldQuads: js.Array[Quad], newQuads: js.Array[Quad], opts: PatchOpts): js.Promise[VoidResult] = js.native
    
    def multiPut(quads: js.Array[Quad]): js.Promise[VoidResult] = js.native
    def multiPut(quads: js.Array[Quad], opts: PutOpts): js.Promise[VoidResult] = js.native
    
    def open(): js.Promise[Unit] = js.native
    
    def patch(oldQuad: Quad, newQuad: Quad): js.Promise[VoidResult] = js.native
    def patch(oldQuad: Quad, newQuad: Quad, opts: PatchOpts): js.Promise[VoidResult] = js.native
    
    val prefixes: Prefixes = js.native
    
    def put(quad: Quad): js.Promise[VoidResult] = js.native
    def put(quad: Quad, opts: PutOpts): js.Promise[VoidResult] = js.native
    
    def putStream(source: TSReadable[Quad]): js.Promise[VoidResult] = js.native
    def putStream(source: TSReadable[Quad], opts: PutStreamOpts): js.Promise[VoidResult] = js.native
    
    def removeMatches(): EventEmitter = js.native
    def removeMatches(subject: Unit, predicate: Unit, `object`: Unit, graph: Unit, opts: GetOpts): EventEmitter = js.native
    def removeMatches(subject: Unit, predicate: Unit, `object`: Unit, graph: QuadGraph): EventEmitter = js.native
    def removeMatches(subject: Unit, predicate: Unit, `object`: Unit, graph: QuadGraph, opts: GetOpts): EventEmitter = js.native
    def removeMatches(subject: Unit, predicate: Unit, `object`: QuadObject): EventEmitter = js.native
    def removeMatches(subject: Unit, predicate: Unit, `object`: QuadObject, graph: Unit, opts: GetOpts): EventEmitter = js.native
    def removeMatches(subject: Unit, predicate: Unit, `object`: QuadObject, graph: QuadGraph): EventEmitter = js.native
    def removeMatches(subject: Unit, predicate: Unit, `object`: QuadObject, graph: QuadGraph, opts: GetOpts): EventEmitter = js.native
    def removeMatches(subject: Unit, predicate: QuadPredicate): EventEmitter = js.native
    def removeMatches(subject: Unit, predicate: QuadPredicate, `object`: Unit, graph: Unit, opts: GetOpts): EventEmitter = js.native
    def removeMatches(subject: Unit, predicate: QuadPredicate, `object`: Unit, graph: QuadGraph): EventEmitter = js.native
    def removeMatches(subject: Unit, predicate: QuadPredicate, `object`: Unit, graph: QuadGraph, opts: GetOpts): EventEmitter = js.native
    def removeMatches(subject: Unit, predicate: QuadPredicate, `object`: QuadObject): EventEmitter = js.native
    def removeMatches(subject: Unit, predicate: QuadPredicate, `object`: QuadObject, graph: Unit, opts: GetOpts): EventEmitter = js.native
    def removeMatches(subject: Unit, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): EventEmitter = js.native
    def removeMatches(subject: Unit, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph, opts: GetOpts): EventEmitter = js.native
    def removeMatches(subject: QuadSubject): EventEmitter = js.native
    def removeMatches(subject: QuadSubject, predicate: Unit, `object`: Unit, graph: Unit, opts: GetOpts): EventEmitter = js.native
    def removeMatches(subject: QuadSubject, predicate: Unit, `object`: Unit, graph: QuadGraph): EventEmitter = js.native
    def removeMatches(subject: QuadSubject, predicate: Unit, `object`: Unit, graph: QuadGraph, opts: GetOpts): EventEmitter = js.native
    def removeMatches(subject: QuadSubject, predicate: Unit, `object`: QuadObject): EventEmitter = js.native
    def removeMatches(subject: QuadSubject, predicate: Unit, `object`: QuadObject, graph: Unit, opts: GetOpts): EventEmitter = js.native
    def removeMatches(subject: QuadSubject, predicate: Unit, `object`: QuadObject, graph: QuadGraph): EventEmitter = js.native
    def removeMatches(subject: QuadSubject, predicate: Unit, `object`: QuadObject, graph: QuadGraph, opts: GetOpts): EventEmitter = js.native
    def removeMatches(subject: QuadSubject, predicate: QuadPredicate): EventEmitter = js.native
    def removeMatches(subject: QuadSubject, predicate: QuadPredicate, `object`: Unit, graph: Unit, opts: GetOpts): EventEmitter = js.native
    def removeMatches(subject: QuadSubject, predicate: QuadPredicate, `object`: Unit, graph: QuadGraph): EventEmitter = js.native
    def removeMatches(subject: QuadSubject, predicate: QuadPredicate, `object`: Unit, graph: QuadGraph, opts: GetOpts): EventEmitter = js.native
    def removeMatches(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): EventEmitter = js.native
    def removeMatches(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: Unit, opts: GetOpts): EventEmitter = js.native
    def removeMatches(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): EventEmitter = js.native
    def removeMatches(
      subject: QuadSubject,
      predicate: QuadPredicate,
      `object`: QuadObject,
      graph: QuadGraph,
      opts: GetOpts
    ): EventEmitter = js.native
    
    def toJSON(): String = js.native
    
    /* private */ var writeBatch: Any = js.native
  }
}
