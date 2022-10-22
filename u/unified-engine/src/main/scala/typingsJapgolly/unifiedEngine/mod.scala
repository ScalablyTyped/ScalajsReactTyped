package typingsJapgolly.unifiedEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unified-engine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def engine(
    options: typingsJapgolly.unifiedEngine.libMod.Options,
    callback: typingsJapgolly.unifiedEngine.libMod.Callback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("engine")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Callback = typingsJapgolly.unifiedEngine.libMod.Callback
  
  type Completer = typingsJapgolly.unifiedEngine.libMod.Completer
  
  type ConfigTransform = typingsJapgolly.unifiedEngine.libMod.ConfigTransform
  
  type Context = typingsJapgolly.unifiedEngine.libMod.Context
  
  type FileSet = typingsJapgolly.unifiedEngine.libMod.FileSet
  
  type Options = typingsJapgolly.unifiedEngine.libMod.Options
  
  type Preset = typingsJapgolly.unifiedEngine.libMod.Preset
  
  type ResolveFrom = typingsJapgolly.unifiedEngine.libMod.ResolveFrom
  
  type VFileReporter = typingsJapgolly.unifiedEngine.libMod.VFileReporter
  
  type VFileReporterOptions = typingsJapgolly.unifiedEngine.libMod.VFileReporterOptions
}
