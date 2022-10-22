package typingsJapgolly.treat

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddCssRequests extends StObject {
    
    def addCssRequests(identifier: Any, requests: Any): Unit
    
    def addModule(moduleIdentifier: Any): Double
    
    def addTheme(theme: Any, identifier: Any, dependencies: Any): Unit
    
    def deleteCssRequests(identifier: Any): Unit
    
    def deleteModuleThemes(moduleIdentifier: Any): Unit
    
    def getAllCssOwners(): js.Array[Any]
    
    def getAllThemedCssRequests(): js.Array[Any]
    
    def getCSSResources(): Set[Any]
    
    def getTheme(themeRef: Any): Any
    
    def getThemeCount(): Double
    
    def getThemeDependencies(): js.Array[Any]
    
    def getThemeIdentifiers(): js.Array[Any]
    
    def getThemedCssModuleInfo(cssResource: Any): Owner
    
    def getThemes(): js.Array[Any]
    
    def getThemesHash(): String
    
    def popAllModules(): js.Array[Any]
  }
  object AddCssRequests {
    
    inline def apply(
      addCssRequests: (Any, Any) => Callback,
      addModule: Any => Double,
      addTheme: (Any, Any, Any) => Callback,
      deleteCssRequests: Any => Callback,
      deleteModuleThemes: Any => Callback,
      getAllCssOwners: CallbackTo[js.Array[Any]],
      getAllThemedCssRequests: CallbackTo[js.Array[Any]],
      getCSSResources: CallbackTo[Set[Any]],
      getTheme: Any => Any,
      getThemeCount: CallbackTo[Double],
      getThemeDependencies: CallbackTo[js.Array[Any]],
      getThemeIdentifiers: CallbackTo[js.Array[Any]],
      getThemedCssModuleInfo: Any => Owner,
      getThemes: CallbackTo[js.Array[Any]],
      getThemesHash: CallbackTo[String],
      popAllModules: CallbackTo[js.Array[Any]]
    ): AddCssRequests = {
      val __obj = js.Dynamic.literal(addCssRequests = js.Any.fromFunction2((t0: Any, t1: Any) => (addCssRequests(t0, t1)).runNow()), addModule = js.Any.fromFunction1(addModule), addTheme = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (addTheme(t0, t1, t2)).runNow()), deleteCssRequests = js.Any.fromFunction1((t0: Any) => deleteCssRequests(t0).runNow()), deleteModuleThemes = js.Any.fromFunction1((t0: Any) => deleteModuleThemes(t0).runNow()), getAllCssOwners = getAllCssOwners.toJsFn, getAllThemedCssRequests = getAllThemedCssRequests.toJsFn, getCSSResources = getCSSResources.toJsFn, getTheme = js.Any.fromFunction1(getTheme), getThemeCount = getThemeCount.toJsFn, getThemeDependencies = getThemeDependencies.toJsFn, getThemeIdentifiers = getThemeIdentifiers.toJsFn, getThemedCssModuleInfo = js.Any.fromFunction1(getThemedCssModuleInfo), getThemes = getThemes.toJsFn, getThemesHash = getThemesHash.toJsFn, popAllModules = popAllModules.toJsFn)
      __obj.asInstanceOf[AddCssRequests]
    }
    
    extension [Self <: AddCssRequests](x: Self) {
      
      inline def setAddCssRequests(value: (Any, Any) => Callback): Self = StObject.set(x, "addCssRequests", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setAddModule(value: Any => Double): Self = StObject.set(x, "addModule", js.Any.fromFunction1(value))
      
      inline def setAddTheme(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "addTheme", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setDeleteCssRequests(value: Any => Callback): Self = StObject.set(x, "deleteCssRequests", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setDeleteModuleThemes(value: Any => Callback): Self = StObject.set(x, "deleteModuleThemes", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setGetAllCssOwners(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getAllCssOwners", value.toJsFn)
      
      inline def setGetAllThemedCssRequests(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getAllThemedCssRequests", value.toJsFn)
      
      inline def setGetCSSResources(value: CallbackTo[Set[Any]]): Self = StObject.set(x, "getCSSResources", value.toJsFn)
      
      inline def setGetTheme(value: Any => Any): Self = StObject.set(x, "getTheme", js.Any.fromFunction1(value))
      
      inline def setGetThemeCount(value: CallbackTo[Double]): Self = StObject.set(x, "getThemeCount", value.toJsFn)
      
      inline def setGetThemeDependencies(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getThemeDependencies", value.toJsFn)
      
      inline def setGetThemeIdentifiers(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getThemeIdentifiers", value.toJsFn)
      
      inline def setGetThemedCssModuleInfo(value: Any => Owner): Self = StObject.set(x, "getThemedCssModuleInfo", js.Any.fromFunction1(value))
      
      inline def setGetThemes(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getThemes", value.toJsFn)
      
      inline def setGetThemesHash(value: CallbackTo[String]): Self = StObject.set(x, "getThemesHash", value.toJsFn)
      
      inline def setPopAllModules(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "popAllModules", value.toJsFn)
    }
  }
  
  trait Browsers extends StObject {
    
    var browsers: Any
    
    var hmr: Any
    
    var outputCSS: Any
    
    var outputLoaders: Any
  }
  object Browsers {
    
    inline def apply(browsers: Any, hmr: Any, outputCSS: Any, outputLoaders: Any): Browsers = {
      val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any], hmr = hmr.asInstanceOf[js.Any], outputCSS = outputCSS.asInstanceOf[js.Any], outputLoaders = outputLoaders.asInstanceOf[js.Any])
      __obj.asInstanceOf[Browsers]
    }
    
    extension [Self <: Browsers](x: Self) {
      
      inline def setBrowsers(value: Any): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      inline def setHmr(value: Any): Self = StObject.set(x, "hmr", value.asInstanceOf[js.Any])
      
      inline def setOutputCSS(value: Any): Self = StObject.set(x, "outputCSS", value.asInstanceOf[js.Any])
      
      inline def setOutputLoaders(value: Any): Self = StObject.set(x, "outputLoaders", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dependencies extends StObject {
    
    var dependencies: Any
    
    var source: Any
  }
  object Dependencies {
    
    inline def apply(dependencies: Any, source: Any): Dependencies = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dependencies]
    }
    
    extension [Self <: Dependencies](x: Self) {
      
      inline def setDependencies(value: Any): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExpireCache extends StObject {
    
    def expireCache(changedFiles: Any): Unit
    
    def getCompiledSource(loader: Any): js.Promise[Dependencies]
  }
  object ExpireCache {
    
    inline def apply(expireCache: Any => Callback, getCompiledSource: Any => js.Promise[Dependencies]): ExpireCache = {
      val __obj = js.Dynamic.literal(expireCache = js.Any.fromFunction1((t0: Any) => expireCache(t0).runNow()), getCompiledSource = js.Any.fromFunction1(getCompiledSource))
      __obj.asInstanceOf[ExpireCache]
    }
    
    extension [Self <: ExpireCache](x: Self) {
      
      inline def setExpireCache(value: Any => Callback): Self = StObject.set(x, "expireCache", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setGetCompiledSource(value: Any => js.Promise[Dependencies]): Self = StObject.set(x, "getCompiledSource", js.Any.fromFunction1(value))
    }
  }
  
  trait From extends StObject {
    
    var browsers: Any
    
    var from: Any
    
    var minify: Any
  }
  object From {
    
    inline def apply(browsers: Any, from: Any, minify: Any): From = {
      val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], minify = minify.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setBrowsers(value: Any): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setMinify(value: Any): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetCGModulePostOrderIndex extends StObject {
    
    def getCGModulePostOrderIndex(chunkGroup: Any, module: Any): Any
    
    def getCGModulePreOrderIndex(chunkGroup: Any, module: Any): Any
    
    def getDependencyModule(compilation: Any, dependency: Any): Any
    
    def getExternalsPlugin(compiler: Any): Any
    
    def getLimitChunkCountPlugin(compiler: Any): Any
    
    def getModifiedFiles(watchCompiler: Any): js.Array[Any]
    
    def getModuleIssuer(compilation: Any, module: Any): Any
    
    def getModulePostOrderIndex(compilation: Any, module: Any): Any
    
    def getModulePreOrderIndex(compilation: Any, module: Any): Any
    
    def getNodeTargetPlugin(compiler: Any): Any
    
    def getNodeTemplatePlugin(compiler: Any): Any
    
    def isModuleInChunk(compilation: Any, module: Any, chunk: Any): Any
    
    def isModuleUsed(compilation: Any, module: Any): Any
    
    var isWebpack5: Boolean
    
    def setCGModulePostOrderIndex(chunkGroup: Any, module: Any, index: Any): Any
    
    def setCGModulePreOrderIndex(chunkGroup: Any, module: Any, index: Any): Any
    
    def setModulePostOrderIndex(compilation: Any, module: Any, index: Any): Any
    
    def setModulePreOrderIndex(compilation: Any, module: Any, index: Any): Any
  }
  object GetCGModulePostOrderIndex {
    
    inline def apply(
      getCGModulePostOrderIndex: (Any, Any) => Any,
      getCGModulePreOrderIndex: (Any, Any) => Any,
      getDependencyModule: (Any, Any) => Any,
      getExternalsPlugin: Any => Any,
      getLimitChunkCountPlugin: Any => Any,
      getModifiedFiles: Any => js.Array[Any],
      getModuleIssuer: (Any, Any) => Any,
      getModulePostOrderIndex: (Any, Any) => Any,
      getModulePreOrderIndex: (Any, Any) => Any,
      getNodeTargetPlugin: Any => Any,
      getNodeTemplatePlugin: Any => Any,
      isModuleInChunk: (Any, Any, Any) => Any,
      isModuleUsed: (Any, Any) => Any,
      isWebpack5: Boolean,
      setCGModulePostOrderIndex: (Any, Any, Any) => Any,
      setCGModulePreOrderIndex: (Any, Any, Any) => Any,
      setModulePostOrderIndex: (Any, Any, Any) => Any,
      setModulePreOrderIndex: (Any, Any, Any) => Any
    ): GetCGModulePostOrderIndex = {
      val __obj = js.Dynamic.literal(getCGModulePostOrderIndex = js.Any.fromFunction2(getCGModulePostOrderIndex), getCGModulePreOrderIndex = js.Any.fromFunction2(getCGModulePreOrderIndex), getDependencyModule = js.Any.fromFunction2(getDependencyModule), getExternalsPlugin = js.Any.fromFunction1(getExternalsPlugin), getLimitChunkCountPlugin = js.Any.fromFunction1(getLimitChunkCountPlugin), getModifiedFiles = js.Any.fromFunction1(getModifiedFiles), getModuleIssuer = js.Any.fromFunction2(getModuleIssuer), getModulePostOrderIndex = js.Any.fromFunction2(getModulePostOrderIndex), getModulePreOrderIndex = js.Any.fromFunction2(getModulePreOrderIndex), getNodeTargetPlugin = js.Any.fromFunction1(getNodeTargetPlugin), getNodeTemplatePlugin = js.Any.fromFunction1(getNodeTemplatePlugin), isModuleInChunk = js.Any.fromFunction3(isModuleInChunk), isModuleUsed = js.Any.fromFunction2(isModuleUsed), isWebpack5 = isWebpack5.asInstanceOf[js.Any], setCGModulePostOrderIndex = js.Any.fromFunction3(setCGModulePostOrderIndex), setCGModulePreOrderIndex = js.Any.fromFunction3(setCGModulePreOrderIndex), setModulePostOrderIndex = js.Any.fromFunction3(setModulePostOrderIndex), setModulePreOrderIndex = js.Any.fromFunction3(setModulePreOrderIndex))
      __obj.asInstanceOf[GetCGModulePostOrderIndex]
    }
    
    extension [Self <: GetCGModulePostOrderIndex](x: Self) {
      
      inline def setGetCGModulePostOrderIndex(value: (Any, Any) => Any): Self = StObject.set(x, "getCGModulePostOrderIndex", js.Any.fromFunction2(value))
      
      inline def setGetCGModulePreOrderIndex(value: (Any, Any) => Any): Self = StObject.set(x, "getCGModulePreOrderIndex", js.Any.fromFunction2(value))
      
      inline def setGetDependencyModule(value: (Any, Any) => Any): Self = StObject.set(x, "getDependencyModule", js.Any.fromFunction2(value))
      
      inline def setGetExternalsPlugin(value: Any => Any): Self = StObject.set(x, "getExternalsPlugin", js.Any.fromFunction1(value))
      
      inline def setGetLimitChunkCountPlugin(value: Any => Any): Self = StObject.set(x, "getLimitChunkCountPlugin", js.Any.fromFunction1(value))
      
      inline def setGetModifiedFiles(value: Any => js.Array[Any]): Self = StObject.set(x, "getModifiedFiles", js.Any.fromFunction1(value))
      
      inline def setGetModuleIssuer(value: (Any, Any) => Any): Self = StObject.set(x, "getModuleIssuer", js.Any.fromFunction2(value))
      
      inline def setGetModulePostOrderIndex(value: (Any, Any) => Any): Self = StObject.set(x, "getModulePostOrderIndex", js.Any.fromFunction2(value))
      
      inline def setGetModulePreOrderIndex(value: (Any, Any) => Any): Self = StObject.set(x, "getModulePreOrderIndex", js.Any.fromFunction2(value))
      
      inline def setGetNodeTargetPlugin(value: Any => Any): Self = StObject.set(x, "getNodeTargetPlugin", js.Any.fromFunction1(value))
      
      inline def setGetNodeTemplatePlugin(value: Any => Any): Self = StObject.set(x, "getNodeTemplatePlugin", js.Any.fromFunction1(value))
      
      inline def setIsModuleInChunk(value: (Any, Any, Any) => Any): Self = StObject.set(x, "isModuleInChunk", js.Any.fromFunction3(value))
      
      inline def setIsModuleUsed(value: (Any, Any) => Any): Self = StObject.set(x, "isModuleUsed", js.Any.fromFunction2(value))
      
      inline def setIsWebpack5(value: Boolean): Self = StObject.set(x, "isWebpack5", value.asInstanceOf[js.Any])
      
      inline def setSetCGModulePostOrderIndex(value: (Any, Any, Any) => Any): Self = StObject.set(x, "setCGModulePostOrderIndex", js.Any.fromFunction3(value))
      
      inline def setSetCGModulePreOrderIndex(value: (Any, Any, Any) => Any): Self = StObject.set(x, "setCGModulePreOrderIndex", js.Any.fromFunction3(value))
      
      inline def setSetModulePostOrderIndex(value: (Any, Any, Any) => Any): Self = StObject.set(x, "setModulePostOrderIndex", js.Any.fromFunction3(value))
      
      inline def setSetModulePreOrderIndex(value: (Any, Any, Any) => Any): Self = StObject.set(x, "setModulePreOrderIndex", js.Any.fromFunction3(value))
    }
  }
  
  trait GetOwnerIndex extends StObject {
    
    var getOwnerIndex: Any
    
    var getPostIndex: Any
    
    var getPreIndex: Any
    
    var getThemeIndex: Any
    
    var setPostIndex: Any
    
    var setPreIndex: Any
  }
  object GetOwnerIndex {
    
    inline def apply(
      getOwnerIndex: Any,
      getPostIndex: Any,
      getPreIndex: Any,
      getThemeIndex: Any,
      setPostIndex: Any,
      setPreIndex: Any
    ): GetOwnerIndex = {
      val __obj = js.Dynamic.literal(getOwnerIndex = getOwnerIndex.asInstanceOf[js.Any], getPostIndex = getPostIndex.asInstanceOf[js.Any], getPreIndex = getPreIndex.asInstanceOf[js.Any], getThemeIndex = getThemeIndex.asInstanceOf[js.Any], setPostIndex = setPostIndex.asInstanceOf[js.Any], setPreIndex = setPreIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOwnerIndex]
    }
    
    extension [Self <: GetOwnerIndex](x: Self) {
      
      inline def setGetOwnerIndex(value: Any): Self = StObject.set(x, "getOwnerIndex", value.asInstanceOf[js.Any])
      
      inline def setGetPostIndex(value: Any): Self = StObject.set(x, "getPostIndex", value.asInstanceOf[js.Any])
      
      inline def setGetPreIndex(value: Any): Self = StObject.set(x, "getPreIndex", value.asInstanceOf[js.Any])
      
      inline def setGetThemeIndex(value: Any): Self = StObject.set(x, "getThemeIndex", value.asInstanceOf[js.Any])
      
      inline def setSetPostIndex(value: Any): Self = StObject.set(x, "setPostIndex", value.asInstanceOf[js.Any])
      
      inline def setSetPreIndex(value: Any): Self = StObject.set(x, "setPreIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait Owner extends StObject {
    
    var owner: Any
    
    var theme: Any
    
    var `type`: Any
  }
  object Owner {
    
    inline def apply(owner: Any, theme: Any, `type`: Any): Owner = {
      val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Owner]
    }
    
    extension [Self <: Owner](x: Self) {
      
      inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Any): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
