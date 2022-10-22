package typingsJapgolly.tsLoader.distInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Map
import typingsJapgolly.std.WeakMap
import typingsJapgolly.tsLoader.anon.Callbacks
import typingsJapgolly.tsLoader.anon.FnCall
import typingsJapgolly.tsLoader.tsLoaderBooleans.`true`
import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.ModuleResolutionHost
import typingsJapgolly.typescript.mod.ResolvedModuleWithFailedLookupLocations
import typingsJapgolly.typescript.mod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CustomResolveModuleName = js.Function5[
/* moduleName */ String, 
/* containingFile */ String, 
/* compilerOptions */ CompilerOptions, 
/* moduleResolutionHost */ ModuleResolutionHost, 
/* parentResolver */ ResolveModuleName, 
ResolvedModuleWithFailedLookupLocations]

type CustomResolveTypeReferenceDirective = js.Function5[
/* typeDirectiveName */ String, 
/* containingFile */ String, 
/* compilerOptions */ CompilerOptions, 
/* moduleResolutionHost */ ModuleResolutionHost, 
/* parentResolver */ FnCall, 
ResolvedTypeReferenceDirectiveWithFailedLookupLocations]

type DependencyGraph = Map[FilePathKey, js.Array[ResolvedModule]]

type LoaderOptionsCache = StringDictionary[WeakMap[LoaderOptions, LoaderOptions]]

type ResolveModuleName = js.Function4[
/* moduleName */ String, 
/* containingFile */ String, 
/* compilerOptions */ CompilerOptions, 
/* moduleResolutionHost */ ModuleResolutionHost, 
ResolvedModuleWithFailedLookupLocations]

type ReverseDependencyGraph = Map[FilePathKey, Map[FilePathKey, `true`]]

type TSFiles = Map[FilePathKey, TSFile]

type WatchCallbacks[T] = Map[FilePathKey, Callbacks[T]]
