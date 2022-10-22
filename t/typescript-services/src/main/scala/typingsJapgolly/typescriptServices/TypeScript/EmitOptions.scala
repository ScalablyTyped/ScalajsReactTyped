package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitOptions extends StObject {
  
  /* private */ var _commonDirectoryPath: Any
  
  /* private */ var _diagnostic: Any
  
  /* private */ var _outputDirectory: Any
  
  /* private */ var _settings: Any
  
  /* private */ var _sharedOutputFile: Any
  
  /* private */ var _sourceMapRootDirectory: Any
  
  /* private */ var _sourceRootDirectory: Any
  
  def commonDirectoryPath(): String
  
  def compilationSettings(): ImmutableCompilationSettings
  
  /* private */ def determineCommonDirectoryPath(compiler: Any): Any
  
  def diagnostic(): Diagnostic
  
  def outputDirectory(): String
  
  def resolvePath(path: String): String
  
  def sharedOutputFile(): String
  
  def sourceMapRootDirectory(): String
  
  def sourceRootDirectory(): String
}
object EmitOptions {
  
  inline def apply(
    _commonDirectoryPath: Any,
    _diagnostic: Any,
    _outputDirectory: Any,
    _settings: Any,
    _sharedOutputFile: Any,
    _sourceMapRootDirectory: Any,
    _sourceRootDirectory: Any,
    commonDirectoryPath: CallbackTo[String],
    compilationSettings: CallbackTo[ImmutableCompilationSettings],
    determineCommonDirectoryPath: Any => Any,
    diagnostic: CallbackTo[Diagnostic],
    outputDirectory: CallbackTo[String],
    resolvePath: String => String,
    sharedOutputFile: CallbackTo[String],
    sourceMapRootDirectory: CallbackTo[String],
    sourceRootDirectory: CallbackTo[String]
  ): EmitOptions = {
    val __obj = js.Dynamic.literal(_commonDirectoryPath = _commonDirectoryPath.asInstanceOf[js.Any], _diagnostic = _diagnostic.asInstanceOf[js.Any], _outputDirectory = _outputDirectory.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], _sharedOutputFile = _sharedOutputFile.asInstanceOf[js.Any], _sourceMapRootDirectory = _sourceMapRootDirectory.asInstanceOf[js.Any], _sourceRootDirectory = _sourceRootDirectory.asInstanceOf[js.Any], commonDirectoryPath = commonDirectoryPath.toJsFn, compilationSettings = compilationSettings.toJsFn, determineCommonDirectoryPath = js.Any.fromFunction1(determineCommonDirectoryPath), diagnostic = diagnostic.toJsFn, outputDirectory = outputDirectory.toJsFn, resolvePath = js.Any.fromFunction1(resolvePath), sharedOutputFile = sharedOutputFile.toJsFn, sourceMapRootDirectory = sourceMapRootDirectory.toJsFn, sourceRootDirectory = sourceRootDirectory.toJsFn)
    __obj.asInstanceOf[EmitOptions]
  }
  
  extension [Self <: EmitOptions](x: Self) {
    
    inline def setCommonDirectoryPath(value: CallbackTo[String]): Self = StObject.set(x, "commonDirectoryPath", value.toJsFn)
    
    inline def setCompilationSettings(value: CallbackTo[ImmutableCompilationSettings]): Self = StObject.set(x, "compilationSettings", value.toJsFn)
    
    inline def setDetermineCommonDirectoryPath(value: Any => Any): Self = StObject.set(x, "determineCommonDirectoryPath", js.Any.fromFunction1(value))
    
    inline def setDiagnostic(value: CallbackTo[Diagnostic]): Self = StObject.set(x, "diagnostic", value.toJsFn)
    
    inline def setOutputDirectory(value: CallbackTo[String]): Self = StObject.set(x, "outputDirectory", value.toJsFn)
    
    inline def setResolvePath(value: String => String): Self = StObject.set(x, "resolvePath", js.Any.fromFunction1(value))
    
    inline def setSharedOutputFile(value: CallbackTo[String]): Self = StObject.set(x, "sharedOutputFile", value.toJsFn)
    
    inline def setSourceMapRootDirectory(value: CallbackTo[String]): Self = StObject.set(x, "sourceMapRootDirectory", value.toJsFn)
    
    inline def setSourceRootDirectory(value: CallbackTo[String]): Self = StObject.set(x, "sourceRootDirectory", value.toJsFn)
    
    inline def set_commonDirectoryPath(value: Any): Self = StObject.set(x, "_commonDirectoryPath", value.asInstanceOf[js.Any])
    
    inline def set_diagnostic(value: Any): Self = StObject.set(x, "_diagnostic", value.asInstanceOf[js.Any])
    
    inline def set_outputDirectory(value: Any): Self = StObject.set(x, "_outputDirectory", value.asInstanceOf[js.Any])
    
    inline def set_settings(value: Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
    
    inline def set_sharedOutputFile(value: Any): Self = StObject.set(x, "_sharedOutputFile", value.asInstanceOf[js.Any])
    
    inline def set_sourceMapRootDirectory(value: Any): Self = StObject.set(x, "_sourceMapRootDirectory", value.asInstanceOf[js.Any])
    
    inline def set_sourceRootDirectory(value: Any): Self = StObject.set(x, "_sourceRootDirectory", value.asInstanceOf[js.Any])
  }
}
