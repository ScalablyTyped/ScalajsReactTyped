package typingsJapgolly.tsNode

import typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksFormat
import typingsJapgolly.tsNode.mod.ExperimentalSpecifierResolution
import typingsJapgolly.tsNode.mod.ModuleTypeOverride
import typingsJapgolly.tsNode.mod.NodeModuleEmitKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsNodeStrings {
  
  @js.native
  sealed trait _package
    extends StObject
       with ModuleTypeOverride
  inline def _package: _package = "package".asInstanceOf[_package]
  
  @js.native
  sealed trait builtin
    extends StObject
       with NodeLoaderHooksFormat
  inline def builtin: builtin = "builtin".asInstanceOf[builtin]
  
  @js.native
  sealed trait cjs
    extends StObject
       with ModuleTypeOverride
  inline def cjs: cjs = "cjs".asInstanceOf[cjs]
  
  @js.native
  sealed trait commonjs
    extends StObject
       with NodeLoaderHooksFormat
  inline def commonjs: commonjs = "commonjs".asInstanceOf[commonjs]
  
  @js.native
  sealed trait dynamic
    extends StObject
       with NodeLoaderHooksFormat
  inline def dynamic: dynamic = "dynamic".asInstanceOf[dynamic]
  
  @js.native
  sealed trait esm
    extends StObject
       with ModuleTypeOverride
  inline def esm: esm = "esm".asInstanceOf[esm]
  
  @js.native
  sealed trait explicit
    extends StObject
       with ExperimentalSpecifierResolution
  inline def explicit: explicit = "explicit".asInstanceOf[explicit]
  
  @js.native
  sealed trait json
    extends StObject
       with NodeLoaderHooksFormat
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait module
    extends StObject
       with NodeLoaderHooksFormat
  inline def module: module = "module".asInstanceOf[module]
  
  @js.native
  sealed trait node
    extends StObject
       with ExperimentalSpecifierResolution
  inline def node: node = "node".asInstanceOf[node]
  
  @js.native
  sealed trait nodecjs
    extends StObject
       with NodeModuleEmitKind
  inline def nodecjs: nodecjs = "nodecjs".asInstanceOf[nodecjs]
  
  @js.native
  sealed trait nodeesm
    extends StObject
       with NodeModuleEmitKind
  inline def nodeesm: nodeesm = "nodeesm".asInstanceOf[nodeesm]
  
  @js.native
  sealed trait wasm
    extends StObject
       with NodeLoaderHooksFormat
  inline def wasm: wasm = "wasm".asInstanceOf[wasm]
}
