package typingsJapgolly.barnard59Base

import typingsJapgolly.barnard59Base.combineMod.FirstOrDuplex
import typingsJapgolly.barnard59Base.concatMod.ConcatStream
import typingsJapgolly.barnard59Base.concatMod.Factory
import typingsJapgolly.barnard59Base.filterMod.Filter
import typingsJapgolly.barnard59Base.globMod.Options
import typingsJapgolly.barnard59Core.libStreamObjectMod.Context
import typingsJapgolly.node.streamMod.DuplexOptions
import typingsJapgolly.node.streamMod.Stream
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.readableStream.mod.Readable
import typingsJapgolly.readableStream.mod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("barnard59-base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combine[T /* <: typingsJapgolly.node.streamMod.^ */](streams: js.Array[T | typingsJapgolly.node.streamMod.^]): FirstOrDuplex[
    T, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof streams */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(streams.asInstanceOf[js.Any]).asInstanceOf[FirstOrDuplex[
    T, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof streams */ Any
  ]]
  inline def combine[T /* <: typingsJapgolly.node.streamMod.^ */](streams: js.Array[T | typingsJapgolly.node.streamMod.^], options: DuplexOptions): FirstOrDuplex[
    T, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof streams */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(streams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FirstOrDuplex[
    T, 
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof streams */ Any
  ]]
  
  @JSImport("barnard59-base", "concat")
  @js.native
  val concat: Factory = js.native
  
  inline def concatObject(streams: Stream*): ConcatStream = ^.asInstanceOf[js.Dynamic].applyDynamic("concatObject")(streams.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ConcatStream]
  
  inline def filter[T](func: Filter[T]): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(func.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  inline def flatten(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[Transform]
  
  inline def glob(arg: Options): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("glob")(arg.asInstanceOf[js.Any]).asInstanceOf[Readable]
  
  inline def jsonParse(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonParse")().asInstanceOf[Transform]
  
  inline def jsonStringify(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonStringify")().asInstanceOf[Transform]
  
  inline def limit(limit: Double): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  inline def map[From, To](
    // tslint:disable-next-line:no-unnecessary-generics
  cb: js.ThisFunction2[/* this */ Context, /* chunk */ From, /* encoding */ String, js.Promise[To] | To]
  ): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(cb.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  inline def nul(): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("nul")().asInstanceOf[Writable]
  
  inline def offset(offset: Double): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")(offset.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  inline def stdout(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("stdout")().asInstanceOf[Transform]
  
  inline def toString_(): typingsJapgolly.readableStream.mod.Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[typingsJapgolly.readableStream.mod.Transform]
}
