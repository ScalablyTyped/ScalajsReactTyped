package typingsJapgolly.apolloProtobufjs.lightMod

import typingsJapgolly.apolloProtobufjs.lightMod.^
import typingsJapgolly.apolloProtobufjs.mod.Codegen
import typingsJapgolly.apolloProtobufjs.mod.IParseOptions
import typingsJapgolly.apolloProtobufjs.mod.IParserResult
import typingsJapgolly.apolloProtobufjs.mod.LoadCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def build: String = ^.asInstanceOf[js.Dynamic].selectDynamic("build").asInstanceOf[String]

inline def configure(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")().asInstanceOf[Unit]

inline def decoder(mtype: typingsJapgolly.apolloProtobufjs.mod.Type): Codegen = ^.asInstanceOf[js.Dynamic].applyDynamic("decoder")(mtype.asInstanceOf[js.Any]).asInstanceOf[Codegen]

inline def encoder(mtype: typingsJapgolly.apolloProtobufjs.mod.Type): Codegen = ^.asInstanceOf[js.Dynamic].applyDynamic("encoder")(mtype.asInstanceOf[js.Any]).asInstanceOf[Codegen]

inline def load(filename: String): js.Promise[typingsJapgolly.apolloProtobufjs.mod.Root] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.apolloProtobufjs.mod.Root]]
inline def load(filename: String, callback: LoadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def load(filename: String, root: typingsJapgolly.apolloProtobufjs.mod.Root): js.Promise[typingsJapgolly.apolloProtobufjs.mod.Root] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.apolloProtobufjs.mod.Root]]
inline def load(filename: String, root: typingsJapgolly.apolloProtobufjs.mod.Root, callback: LoadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def load(filename: js.Array[String]): js.Promise[typingsJapgolly.apolloProtobufjs.mod.Root] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.apolloProtobufjs.mod.Root]]
inline def load(filename: js.Array[String], callback: LoadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def load(filename: js.Array[String], root: typingsJapgolly.apolloProtobufjs.mod.Root): js.Promise[typingsJapgolly.apolloProtobufjs.mod.Root] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.apolloProtobufjs.mod.Root]]
inline def load(
  filename: js.Array[String],
  root: typingsJapgolly.apolloProtobufjs.mod.Root,
  callback: LoadCallback
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def loadSync(filename: String): typingsJapgolly.apolloProtobufjs.mod.Root = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.apolloProtobufjs.mod.Root]
inline def loadSync(filename: String, root: typingsJapgolly.apolloProtobufjs.mod.Root): typingsJapgolly.apolloProtobufjs.mod.Root = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.apolloProtobufjs.mod.Root]
inline def loadSync(filename: js.Array[String]): typingsJapgolly.apolloProtobufjs.mod.Root = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.apolloProtobufjs.mod.Root]
inline def loadSync(filename: js.Array[String], root: typingsJapgolly.apolloProtobufjs.mod.Root): typingsJapgolly.apolloProtobufjs.mod.Root = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.apolloProtobufjs.mod.Root]

inline def parse(source: String): IParserResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[IParserResult]
inline def parse(source: String, options: IParseOptions): IParserResult = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IParserResult]
inline def parse(source: String, root: typingsJapgolly.apolloProtobufjs.mod.Root): IParserResult = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[IParserResult]
inline def parse(source: String, root: typingsJapgolly.apolloProtobufjs.mod.Root, options: IParseOptions): IParserResult = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IParserResult]

inline def verifier(mtype: typingsJapgolly.apolloProtobufjs.mod.Type): Codegen = ^.asInstanceOf[js.Dynamic].applyDynamic("verifier")(mtype.asInstanceOf[js.Any]).asInstanceOf[Codegen]
