package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImmutableCompilationSettings extends StObject {
  
  /* private */ var _allowAutomaticSemicolonInsertion: Any
  
  /* private */ var _codeGenTarget: Any
  
  /* private */ var _codepage: Any
  
  /* private */ var _createFileLog: Any
  
  /* private */ var _gatherDiagnostics: Any
  
  /* private */ var _generateDeclarationFiles: Any
  
  /* private */ var _mapRoot: Any
  
  /* private */ var _mapSourceFiles: Any
  
  /* private */ var _moduleGenTarget: Any
  
  /* private */ var _noImplicitAny: Any
  
  /* private */ var _noLib: Any
  
  /* private */ var _noResolve: Any
  
  /* private */ var _outDirOption: Any
  
  /* private */ var _outFileOption: Any
  
  /* private */ var _propagateEnumConstants: Any
  
  /* private */ var _removeComments: Any
  
  /* private */ var _sourceRoot: Any
  
  /* private */ var _useCaseSensitiveFileResolution: Any
  
  /* private */ var _watch: Any
  
  def allowAutomaticSemicolonInsertion(): Boolean
  
  def codeGenTarget(): LanguageVersion
  
  def codepage(): Double
  
  def createFileLog(): Boolean
  
  def gatherDiagnostics(): Boolean
  
  def generateDeclarationFiles(): Boolean
  
  def mapRoot(): String
  
  def mapSourceFiles(): Boolean
  
  def moduleGenTarget(): ModuleGenTarget
  
  def noImplicitAny(): Boolean
  
  def noLib(): Boolean
  
  def noResolve(): Boolean
  
  def outDirOption(): String
  
  def outFileOption(): String
  
  def propagateEnumConstants(): Boolean
  
  def removeComments(): Boolean
  
  def sourceRoot(): String
  
  def toCompilationSettings(): Any
  
  def useCaseSensitiveFileResolution(): Boolean
  
  def watch(): Boolean
}
object ImmutableCompilationSettings {
  
  inline def apply(
    _allowAutomaticSemicolonInsertion: Any,
    _codeGenTarget: Any,
    _codepage: Any,
    _createFileLog: Any,
    _gatherDiagnostics: Any,
    _generateDeclarationFiles: Any,
    _mapRoot: Any,
    _mapSourceFiles: Any,
    _moduleGenTarget: Any,
    _noImplicitAny: Any,
    _noLib: Any,
    _noResolve: Any,
    _outDirOption: Any,
    _outFileOption: Any,
    _propagateEnumConstants: Any,
    _removeComments: Any,
    _sourceRoot: Any,
    _useCaseSensitiveFileResolution: Any,
    _watch: Any,
    allowAutomaticSemicolonInsertion: CallbackTo[Boolean],
    codeGenTarget: CallbackTo[LanguageVersion],
    codepage: CallbackTo[Double],
    createFileLog: CallbackTo[Boolean],
    gatherDiagnostics: CallbackTo[Boolean],
    generateDeclarationFiles: CallbackTo[Boolean],
    mapRoot: CallbackTo[String],
    mapSourceFiles: CallbackTo[Boolean],
    moduleGenTarget: CallbackTo[ModuleGenTarget],
    noImplicitAny: CallbackTo[Boolean],
    noLib: CallbackTo[Boolean],
    noResolve: CallbackTo[Boolean],
    outDirOption: CallbackTo[String],
    outFileOption: CallbackTo[String],
    propagateEnumConstants: CallbackTo[Boolean],
    removeComments: CallbackTo[Boolean],
    sourceRoot: CallbackTo[String],
    toCompilationSettings: CallbackTo[Any],
    useCaseSensitiveFileResolution: CallbackTo[Boolean],
    watch: CallbackTo[Boolean]
  ): ImmutableCompilationSettings = {
    val __obj = js.Dynamic.literal(_allowAutomaticSemicolonInsertion = _allowAutomaticSemicolonInsertion.asInstanceOf[js.Any], _codeGenTarget = _codeGenTarget.asInstanceOf[js.Any], _codepage = _codepage.asInstanceOf[js.Any], _createFileLog = _createFileLog.asInstanceOf[js.Any], _gatherDiagnostics = _gatherDiagnostics.asInstanceOf[js.Any], _generateDeclarationFiles = _generateDeclarationFiles.asInstanceOf[js.Any], _mapRoot = _mapRoot.asInstanceOf[js.Any], _mapSourceFiles = _mapSourceFiles.asInstanceOf[js.Any], _moduleGenTarget = _moduleGenTarget.asInstanceOf[js.Any], _noImplicitAny = _noImplicitAny.asInstanceOf[js.Any], _noLib = _noLib.asInstanceOf[js.Any], _noResolve = _noResolve.asInstanceOf[js.Any], _outDirOption = _outDirOption.asInstanceOf[js.Any], _outFileOption = _outFileOption.asInstanceOf[js.Any], _propagateEnumConstants = _propagateEnumConstants.asInstanceOf[js.Any], _removeComments = _removeComments.asInstanceOf[js.Any], _sourceRoot = _sourceRoot.asInstanceOf[js.Any], _useCaseSensitiveFileResolution = _useCaseSensitiveFileResolution.asInstanceOf[js.Any], _watch = _watch.asInstanceOf[js.Any], allowAutomaticSemicolonInsertion = allowAutomaticSemicolonInsertion.toJsFn, codeGenTarget = codeGenTarget.toJsFn, codepage = codepage.toJsFn, createFileLog = createFileLog.toJsFn, gatherDiagnostics = gatherDiagnostics.toJsFn, generateDeclarationFiles = generateDeclarationFiles.toJsFn, mapRoot = mapRoot.toJsFn, mapSourceFiles = mapSourceFiles.toJsFn, moduleGenTarget = moduleGenTarget.toJsFn, noImplicitAny = noImplicitAny.toJsFn, noLib = noLib.toJsFn, noResolve = noResolve.toJsFn, outDirOption = outDirOption.toJsFn, outFileOption = outFileOption.toJsFn, propagateEnumConstants = propagateEnumConstants.toJsFn, removeComments = removeComments.toJsFn, sourceRoot = sourceRoot.toJsFn, toCompilationSettings = toCompilationSettings.toJsFn, useCaseSensitiveFileResolution = useCaseSensitiveFileResolution.toJsFn, watch = watch.toJsFn)
    __obj.asInstanceOf[ImmutableCompilationSettings]
  }
  
  extension [Self <: ImmutableCompilationSettings](x: Self) {
    
    inline def setAllowAutomaticSemicolonInsertion(value: CallbackTo[Boolean]): Self = StObject.set(x, "allowAutomaticSemicolonInsertion", value.toJsFn)
    
    inline def setCodeGenTarget(value: CallbackTo[LanguageVersion]): Self = StObject.set(x, "codeGenTarget", value.toJsFn)
    
    inline def setCodepage(value: CallbackTo[Double]): Self = StObject.set(x, "codepage", value.toJsFn)
    
    inline def setCreateFileLog(value: CallbackTo[Boolean]): Self = StObject.set(x, "createFileLog", value.toJsFn)
    
    inline def setGatherDiagnostics(value: CallbackTo[Boolean]): Self = StObject.set(x, "gatherDiagnostics", value.toJsFn)
    
    inline def setGenerateDeclarationFiles(value: CallbackTo[Boolean]): Self = StObject.set(x, "generateDeclarationFiles", value.toJsFn)
    
    inline def setMapRoot(value: CallbackTo[String]): Self = StObject.set(x, "mapRoot", value.toJsFn)
    
    inline def setMapSourceFiles(value: CallbackTo[Boolean]): Self = StObject.set(x, "mapSourceFiles", value.toJsFn)
    
    inline def setModuleGenTarget(value: CallbackTo[ModuleGenTarget]): Self = StObject.set(x, "moduleGenTarget", value.toJsFn)
    
    inline def setNoImplicitAny(value: CallbackTo[Boolean]): Self = StObject.set(x, "noImplicitAny", value.toJsFn)
    
    inline def setNoLib(value: CallbackTo[Boolean]): Self = StObject.set(x, "noLib", value.toJsFn)
    
    inline def setNoResolve(value: CallbackTo[Boolean]): Self = StObject.set(x, "noResolve", value.toJsFn)
    
    inline def setOutDirOption(value: CallbackTo[String]): Self = StObject.set(x, "outDirOption", value.toJsFn)
    
    inline def setOutFileOption(value: CallbackTo[String]): Self = StObject.set(x, "outFileOption", value.toJsFn)
    
    inline def setPropagateEnumConstants(value: CallbackTo[Boolean]): Self = StObject.set(x, "propagateEnumConstants", value.toJsFn)
    
    inline def setRemoveComments(value: CallbackTo[Boolean]): Self = StObject.set(x, "removeComments", value.toJsFn)
    
    inline def setSourceRoot(value: CallbackTo[String]): Self = StObject.set(x, "sourceRoot", value.toJsFn)
    
    inline def setToCompilationSettings(value: CallbackTo[Any]): Self = StObject.set(x, "toCompilationSettings", value.toJsFn)
    
    inline def setUseCaseSensitiveFileResolution(value: CallbackTo[Boolean]): Self = StObject.set(x, "useCaseSensitiveFileResolution", value.toJsFn)
    
    inline def setWatch(value: CallbackTo[Boolean]): Self = StObject.set(x, "watch", value.toJsFn)
    
    inline def set_allowAutomaticSemicolonInsertion(value: Any): Self = StObject.set(x, "_allowAutomaticSemicolonInsertion", value.asInstanceOf[js.Any])
    
    inline def set_codeGenTarget(value: Any): Self = StObject.set(x, "_codeGenTarget", value.asInstanceOf[js.Any])
    
    inline def set_codepage(value: Any): Self = StObject.set(x, "_codepage", value.asInstanceOf[js.Any])
    
    inline def set_createFileLog(value: Any): Self = StObject.set(x, "_createFileLog", value.asInstanceOf[js.Any])
    
    inline def set_gatherDiagnostics(value: Any): Self = StObject.set(x, "_gatherDiagnostics", value.asInstanceOf[js.Any])
    
    inline def set_generateDeclarationFiles(value: Any): Self = StObject.set(x, "_generateDeclarationFiles", value.asInstanceOf[js.Any])
    
    inline def set_mapRoot(value: Any): Self = StObject.set(x, "_mapRoot", value.asInstanceOf[js.Any])
    
    inline def set_mapSourceFiles(value: Any): Self = StObject.set(x, "_mapSourceFiles", value.asInstanceOf[js.Any])
    
    inline def set_moduleGenTarget(value: Any): Self = StObject.set(x, "_moduleGenTarget", value.asInstanceOf[js.Any])
    
    inline def set_noImplicitAny(value: Any): Self = StObject.set(x, "_noImplicitAny", value.asInstanceOf[js.Any])
    
    inline def set_noLib(value: Any): Self = StObject.set(x, "_noLib", value.asInstanceOf[js.Any])
    
    inline def set_noResolve(value: Any): Self = StObject.set(x, "_noResolve", value.asInstanceOf[js.Any])
    
    inline def set_outDirOption(value: Any): Self = StObject.set(x, "_outDirOption", value.asInstanceOf[js.Any])
    
    inline def set_outFileOption(value: Any): Self = StObject.set(x, "_outFileOption", value.asInstanceOf[js.Any])
    
    inline def set_propagateEnumConstants(value: Any): Self = StObject.set(x, "_propagateEnumConstants", value.asInstanceOf[js.Any])
    
    inline def set_removeComments(value: Any): Self = StObject.set(x, "_removeComments", value.asInstanceOf[js.Any])
    
    inline def set_sourceRoot(value: Any): Self = StObject.set(x, "_sourceRoot", value.asInstanceOf[js.Any])
    
    inline def set_useCaseSensitiveFileResolution(value: Any): Self = StObject.set(x, "_useCaseSensitiveFileResolution", value.asInstanceOf[js.Any])
    
    inline def set_watch(value: Any): Self = StObject.set(x, "_watch", value.asInstanceOf[js.Any])
  }
}
