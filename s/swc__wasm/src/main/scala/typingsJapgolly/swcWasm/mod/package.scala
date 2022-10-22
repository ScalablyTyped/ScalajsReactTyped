package typingsJapgolly.swcWasm.mod

import typingsJapgolly.swcWasm.anon.Comments
import typingsJapgolly.swcWasm.anon.IsModule
import typingsJapgolly.swcWasm.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def minify(src: String): js.Promise[Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Output]]
inline def minify(src: String, opts: JsMinifyOptions): js.Promise[Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(src.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Output]]

inline def minifySync(code: String): Output = ^.asInstanceOf[js.Dynamic].applyDynamic("minifySync")(code.asInstanceOf[js.Any]).asInstanceOf[Output]
inline def minifySync(code: String, opts: JsMinifyOptions): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("minifySync")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Output]

inline def parse(src: String): js.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Module]]
inline def parse(src: String, options: (ParseOptions & IsModule) | ParseOptions): js.Promise[Script] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Script]]

inline def parseSync(src: String): Module = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(src.asInstanceOf[js.Any]).asInstanceOf[Module]
inline def parseSync(src: String, options: ParseOptions): Module = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Module]

inline def parseSync_Script(src: String, options: ParseOptions & IsModule): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Script]

inline def print(m: Program): js.Promise[Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(m.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Output]]
inline def print(m: Program, options: Options): js.Promise[Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(m.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Output]]

inline def printSync(m: Program): Output = ^.asInstanceOf[js.Dynamic].applyDynamic("printSync")(m.asInstanceOf[js.Any]).asInstanceOf[Output]
inline def printSync(m: Program, options: Options): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("printSync")(m.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Output]

inline def transform(code: String): js.Promise[Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Output]]
inline def transform(code: String, options: Unit, experimental_plugin_bytes_resolver: Any): js.Promise[Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any], experimental_plugin_bytes_resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Output]]
inline def transform(code: String, options: Options): js.Promise[Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Output]]
inline def transform(code: String, options: Options, experimental_plugin_bytes_resolver: Any): js.Promise[Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any], experimental_plugin_bytes_resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Output]]
inline def transform(code: Program): js.Promise[Output] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Output]]
inline def transform(code: Program, options: Unit, experimental_plugin_bytes_resolver: Any): js.Promise[Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any], experimental_plugin_bytes_resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Output]]
inline def transform(code: Program, options: Options): js.Promise[Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Output]]
inline def transform(code: Program, options: Options, experimental_plugin_bytes_resolver: Any): js.Promise[Output] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any], experimental_plugin_bytes_resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Output]]

inline def transformSync(code: String): Output = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any]).asInstanceOf[Output]
inline def transformSync(code: String, opts: Unit, experimental_plugin_bytes_resolver: Any): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], experimental_plugin_bytes_resolver.asInstanceOf[js.Any])).asInstanceOf[Output]
inline def transformSync(code: String, opts: Options): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Output]
inline def transformSync(code: String, opts: Options, experimental_plugin_bytes_resolver: Any): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], experimental_plugin_bytes_resolver.asInstanceOf[js.Any])).asInstanceOf[Output]
inline def transformSync(code: Program): Output = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any]).asInstanceOf[Output]
inline def transformSync(code: Program, opts: Unit, experimental_plugin_bytes_resolver: Any): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], experimental_plugin_bytes_resolver.asInstanceOf[js.Any])).asInstanceOf[Output]
inline def transformSync(code: Program, opts: Options): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Output]
inline def transformSync(code: Program, opts: Options, experimental_plugin_bytes_resolver: Any): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], experimental_plugin_bytes_resolver.asInstanceOf[js.Any])).asInstanceOf[Output]

type ParseOptions = ParserConfig & Comments

type Plugin = js.Function1[/* module */ Program, Program]

type Swcrc = Config | js.Array[Config]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.swcWasmInts.`5`
  - typingsJapgolly.swcWasm.swcWasmInts.`2015`
  - typingsJapgolly.swcWasm.swcWasmInts.`2016`
  - java.lang.String
  - scala.Double
*/
type TerserEcmaVersion = _TerserEcmaVersion | String | Double
