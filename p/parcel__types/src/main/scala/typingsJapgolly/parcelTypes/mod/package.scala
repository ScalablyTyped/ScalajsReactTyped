package typingsJapgolly.parcelTypes.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.processMod.global.NodeJS.ProcessEnv
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.parcelTypes.anon.Enter
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AST = typingsJapgolly.parcelTypes.libUnsafeMod.AST

type Async[T] = T | js.Promise[T]

type Blob = String | Buffer | Readable

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.parcelTypes.parcelTypesStrings.development
  - typingsJapgolly.parcelTypes.parcelTypesStrings.production
  - java.lang.String
*/
type BuildMode = _BuildMode | String

type ConfigResult = typingsJapgolly.parcelTypes.libUnsafeMod.ConfigResult

type DependencySpecifier = String

type EnvMap = ProcessEnv

type FilePath = String

type Glob = String

type GlobMap[T] = Record[Glob, T]

type GraphTraversalCallback[TNode, TContext] = js.Function3[
/* node */ TNode, 
/* context */ js.UndefOr[TContext | Null], 
/* actions */ TraversalActions, 
js.UndefOr[TContext | Null]]

type GraphVisitor[TNode, TContext] = (GraphTraversalCallback[TNode, TContext]) | (Enter[TNode, TContext])

type JSONValue = Null | Unit | Boolean | Double | String | js.Array[Any] | JSONObject

type Meta = JSONObject

/**
  * Format of <code>pkg#dependencies</code>, <code>pkg#devDependencies</code>, <code>pkg#peerDependencies</code>
  */
type PackageDependencies = Record[PackageName, Semver]

type PackageName = String

type RawParcelConfigPipeline = js.Array[PackageName]

/**
  * @section validator
  * @experimental
  */
type ResolveConfigFn = js.Function1[/* configNames */ js.Array[FilePath], js.Promise[js.UndefOr[FilePath | Null]]]

/**
  * @section validator
  * @experimental
  */
type ResolveConfigWithPathFn = js.Function2[
/* configNames */ js.Array[FilePath], 
/* assetFilePath */ String, 
js.Promise[js.UndefOr[FilePath | Null]]]

type ResolveFn = js.Function2[/* from */ FilePath, /* to */ String, js.Promise[FilePath]]

type Semver = String

type SemverRange = String

type Symbol = String

type VersionMap = Record[String, String]
