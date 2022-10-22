package typingsJapgolly.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloProtobufjs.mod.^
import typingsJapgolly.apolloProtobufjs.mod.rpc.ServiceMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def build: String = ^.asInstanceOf[js.Dynamic].selectDynamic("build").asInstanceOf[String]

inline def configure(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")().asInstanceOf[Unit]

inline def decoder(mtype: Type): Codegen = ^.asInstanceOf[js.Dynamic].applyDynamic("decoder")(mtype.asInstanceOf[js.Any]).asInstanceOf[Codegen]

inline def encoder(mtype: Type): Codegen = ^.asInstanceOf[js.Dynamic].applyDynamic("encoder")(mtype.asInstanceOf[js.Any]).asInstanceOf[Codegen]

inline def load(filename: String): js.Promise[Root] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Root]]
inline def load(filename: String, callback: LoadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def load(filename: String, root: Root): js.Promise[Root] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Root]]
inline def load(filename: String, root: Root, callback: LoadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def load(filename: js.Array[String]): js.Promise[Root] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Root]]
inline def load(filename: js.Array[String], callback: LoadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def load(filename: js.Array[String], root: Root): js.Promise[Root] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Root]]
inline def load(filename: js.Array[String], root: Root, callback: LoadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def loadSync(filename: String): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any]).asInstanceOf[Root]
inline def loadSync(filename: String, root: Root): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Root]
inline def loadSync(filename: js.Array[String]): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any]).asInstanceOf[Root]
inline def loadSync(filename: js.Array[String], root: Root): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Root]

inline def parse(source: String): IParserResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[IParserResult]
inline def parse(source: String, options: IParseOptions): IParserResult = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IParserResult]
inline def parse(source: String, root: Root): IParserResult = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[IParserResult]
inline def parse(source: String, root: Root, options: IParseOptions): IParserResult = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IParserResult]

inline def verifier(mtype: Type): Codegen = ^.asInstanceOf[js.Dynamic].applyDynamic("verifier")(mtype.asInstanceOf[js.Any]).asInstanceOf[Codegen]

type Buffer = js.typedarray.Uint8Array

/**
  * Node-style callback as used by {@link util.fetch}.
  * @param error Error, if any, otherwise `null`
  * @param [contents] File contents, if there hasn't been an error
  */
type FetchCallback = js.Function2[/* error */ js.Error, /* contents */ js.UndefOr[String], Unit]

/**
  * Decorator function as returned by {@link Field.d} and {@link MapField.d} (TypeScript).
  * @param prototype Target prototype
  * @param fieldName Field name
  */
type FieldDecorator = js.Function2[/* prototype */ js.Object, /* fieldName */ String, Unit]

/**
  * A node-style callback as used by {@link load} and {@link Root#load}.
  * @param error Error, if any, otherwise `null`
  * @param [root] Root, if there hasn't been an error
  */
type LoadCallback = js.Function2[/* error */ js.Error | Null, /* root */ js.UndefOr[Root], Unit]

/**
  * Decorator function as returned by {@link OneOf.d} (TypeScript).
  * @param prototype Target prototype
  * @param oneofName OneOf name
  */
type OneOfDecorator = js.Function2[/* prototype */ js.Object, /* oneofName */ String, Unit]

/**
  * A OneOf getter as returned by {@link util.oneOfGetter}.
  * @returns Set field name, if any
  */
type OneOfGetter = js.Function0[js.UndefOr[String]]

/**
  * A OneOf setter as returned by {@link util.oneOfSetter}.
  * @param value Field name
  */
type OneOfSetter = js.Function1[/* value */ js.UndefOr[String], Unit]

/**
  * An allocator as used by {@link util.pool}.
  * @param size Buffer size
  * @returns Buffer
  */
type PoolAllocator = js.Function1[/* size */ Double, js.typedarray.Uint8Array]

/**
  * A slicer as used by {@link util.pool}.
  * @param start Start offset
  * @param end End offset
  * @returns Buffer slice
  */
type PoolSlicer = js.ThisFunction2[
/* this */ js.typedarray.Uint8Array, 
/* start */ Double, 
/* end */ Double, 
js.typedarray.Uint8Array]

/** Properties type. */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ P in keyof T ]:? T[P]}
  }}}
  */
type Properties[T] = T

/**
  * RPC implementation passed to {@link Service#create} performing a service request on network level, i.e. by utilizing http requests or websockets.
  * @param method Reflected or static method being called
  * @param requestData Request data
  * @param callback Callback function
  */
type RPCImpl = js.Function3[
/* method */ Method | (ServiceMethod[Message[js.Object], Message[js.Object]]), 
/* requestData */ js.typedarray.Uint8Array, 
/* callback */ RPCImplCallback, 
Unit]

/**
  * Node-style callback as used by {@link RPCImpl}.
  * @param error Error, if any, otherwise `null`
  * @param [response] Response data or `null` to signal end of stream, if there hasn't been an error
  */
type RPCImplCallback = js.Function2[
/* error */ js.Error | Null, 
/* response */ js.UndefOr[js.typedarray.Uint8Array | Null], 
Unit]

/**
  * Gets the comment on the previous line or, alternatively, the line comment on the specified line.
  * @param [line] Line number
  * @returns Comment text or `null` if none
  */
type TokenizerHandleCmnt = js.Function1[/* line */ js.UndefOr[Double], String | Null]

/**
  * Gets the next token and advances.
  * @returns Next token or `null` on eof
  */
type TokenizerHandleNext = js.Function0[String | Null]

/**
  * Peeks for the next token.
  * @returns Next token or `null` on eof
  */
type TokenizerHandlePeek = js.Function0[String | Null]

/**
  * Pushes a token back to the stack.
  * @param token Token
  */
type TokenizerHandlePush = js.Function1[/* token */ String, Unit]

/**
  * Skips the next token.
  * @param expected Expected token
  * @param [optional=false] If optional
  * @returns Whether the token matched
  * @throws {Error} If the token didn't match and is not optional
  */
type TokenizerHandleSkip = js.Function2[/* expected */ String, /* optional */ js.UndefOr[Boolean], Boolean]

/**
  * Decorator function as returned by {@link Type.d} (TypeScript).
  * @param target Target constructor
  */
type TypeDecorator[T /* <: Message[T] */] = js.Function1[/* target */ Constructor[T], Unit]

/**
  * From object converter part of an {@link IWrapper}.
  * @param object Plain object
  * @returns Message instance
  */
type WrapperFromObjectConverter = js.ThisFunction1[/* this */ Type, /* object */ StringDictionary[Any], Message[js.Object]]

/**
  * To object converter part of an {@link IWrapper}.
  * @param message Message instance
  * @param [options] Conversion options
  * @returns Plain object
  */
type WrapperToObjectConverter = js.ThisFunction2[
/* this */ Type, 
/* message */ Message[js.Object], 
/* options */ js.UndefOr[IConversionOptions], 
StringDictionary[Any]]
