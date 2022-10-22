package typingsJapgolly.babelPresetEnv

import typingsJapgolly.babelPresetEnv.babelPresetEnvBooleans.`true`
import typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.current
import typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.tp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type BrowserslistQuery = String
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.babelPresetEnv.mod.CorejsVersion
    - typingsJapgolly.babelPresetEnv.anon.Proposals
  */
  trait CorejsOption extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.babelPresetEnv.babelPresetEnvInts.`2`
    - typingsJapgolly.babelPresetEnv.babelPresetEnvInts.`3`
  */
  trait CorejsVersion
    extends StObject
       with CorejsOption
  object CorejsVersion {
    
    inline def `2`: typingsJapgolly.babelPresetEnv.babelPresetEnvInts.`2` = 2.asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvInts.`2`]
    
    inline def `3`: typingsJapgolly.babelPresetEnv.babelPresetEnvInts.`3` = 3.asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvInts.`3`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.babelPresetEnv.babelPresetEnvBooleans.`false`
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.amd
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.umd
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.systemjs
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.commonjs
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.cjs
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.auto
  */
  trait ModuleOption extends StObject
  object ModuleOption {
    
    inline def amd: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.amd = "amd".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.amd]
    
    inline def auto: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.auto = "auto".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.auto]
    
    inline def cjs: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.cjs = "cjs".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.cjs]
    
    inline def commonjs: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.commonjs = "commonjs".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.commonjs]
    
    inline def `false`: typingsJapgolly.babelPresetEnv.babelPresetEnvBooleans.`false` = false.asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvBooleans.`false`]
    
    inline def systemjs: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.systemjs = "systemjs".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.systemjs]
    
    inline def umd: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.umd = "umd".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.umd]
  }
  
  trait Options extends StObject {
    
    var bugfixes: js.UndefOr[Boolean] = js.undefined
    
    var configPath: js.UndefOr[String] = js.undefined
    
    var corejs: js.UndefOr[CorejsOption] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var exclude: js.UndefOr[PluginList] = js.undefined
    
    var forceAllTransforms: js.UndefOr[Boolean] = js.undefined
    
    var ignoreBrowserslistConfig: js.UndefOr[Boolean] = js.undefined
    
    var include: js.UndefOr[PluginList] = js.undefined
    
    var loose: js.UndefOr[Boolean] = js.undefined
    
    var modules: js.UndefOr[ModuleOption] = js.undefined
    
    var shippedProposals: js.UndefOr[Boolean] = js.undefined
    
    var spec: js.UndefOr[Boolean] = js.undefined
    
    var targets: js.UndefOr[TargetsOptions] = js.undefined
    
    var useBuiltIns: js.UndefOr[UseBuiltInsOption] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBugfixes(value: Boolean): Self = StObject.set(x, "bugfixes", value.asInstanceOf[js.Any])
      
      inline def setBugfixesUndefined: Self = StObject.set(x, "bugfixes", js.undefined)
      
      inline def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
      
      inline def setConfigPathUndefined: Self = StObject.set(x, "configPath", js.undefined)
      
      inline def setCorejs(value: CorejsOption): Self = StObject.set(x, "corejs", value.asInstanceOf[js.Any])
      
      inline def setCorejsUndefined: Self = StObject.set(x, "corejs", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setExclude(value: PluginList): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: PluginListItem*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setForceAllTransforms(value: Boolean): Self = StObject.set(x, "forceAllTransforms", value.asInstanceOf[js.Any])
      
      inline def setForceAllTransformsUndefined: Self = StObject.set(x, "forceAllTransforms", js.undefined)
      
      inline def setIgnoreBrowserslistConfig(value: Boolean): Self = StObject.set(x, "ignoreBrowserslistConfig", value.asInstanceOf[js.Any])
      
      inline def setIgnoreBrowserslistConfigUndefined: Self = StObject.set(x, "ignoreBrowserslistConfig", js.undefined)
      
      inline def setInclude(value: PluginList): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: PluginListItem*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
      
      inline def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
      
      inline def setModules(value: ModuleOption): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setShippedProposals(value: Boolean): Self = StObject.set(x, "shippedProposals", value.asInstanceOf[js.Any])
      
      inline def setShippedProposalsUndefined: Self = StObject.set(x, "shippedProposals", js.undefined)
      
      inline def setSpec(value: Boolean): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      inline def setTargets(value: TargetsOptions): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      inline def setTargetsVarargs(value: BrowserslistQuery*): Self = StObject.set(x, "targets", js.Array(value*))
      
      inline def setUseBuiltIns(value: UseBuiltInsOption): Self = StObject.set(x, "useBuiltIns", value.asInstanceOf[js.Any])
      
      inline def setUseBuiltInsUndefined: Self = StObject.set(x, "useBuiltIns", js.undefined)
    }
  }
  
  type PluginList = js.Array[PluginListItem]
  
  type PluginListItem = String | js.RegExp
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Android
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Baidu
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.BlackBerry
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.bb
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Chrome
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.ChromeAndroid
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.and_chr
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Edge
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Electron
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Explorer
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.ie
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.ExplorerMobile
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.ie_mob
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Firefox
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.ff
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.FirefoxAndroid
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.and_ff
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.iOS
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.ios_saf
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Node
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Opera
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.OperaMini
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.op_mini
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.OperaMobile
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.op_mob
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.QQAndroid
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.and_qq
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Safari
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Samsung
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.UCAndroid
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.and_uc
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.kaios
  */
  trait Target extends StObject
  object Target {
    
    inline def Android: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Android = "Android".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Android]
    
    inline def Baidu: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Baidu = "Baidu".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Baidu]
    
    inline def BlackBerry: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.BlackBerry = "BlackBerry".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.BlackBerry]
    
    inline def Chrome: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Chrome = "Chrome".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Chrome]
    
    inline def ChromeAndroid: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.ChromeAndroid = "ChromeAndroid".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.ChromeAndroid]
    
    inline def Edge: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Edge = "Edge".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Edge]
    
    inline def Electron: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Electron = "Electron".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Electron]
    
    inline def Explorer: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Explorer = "Explorer".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Explorer]
    
    inline def ExplorerMobile: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.ExplorerMobile = "ExplorerMobile".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.ExplorerMobile]
    
    inline def Firefox: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Firefox = "Firefox".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Firefox]
    
    inline def FirefoxAndroid: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.FirefoxAndroid = "FirefoxAndroid".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.FirefoxAndroid]
    
    inline def Node: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Node = "Node".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Node]
    
    inline def Opera: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Opera = "Opera".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Opera]
    
    inline def OperaMini: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.OperaMini = "OperaMini".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.OperaMini]
    
    inline def OperaMobile: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.OperaMobile = "OperaMobile".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.OperaMobile]
    
    inline def QQAndroid: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.QQAndroid = "QQAndroid".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.QQAndroid]
    
    inline def Safari: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Safari = "Safari".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Safari]
    
    inline def Samsung: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Samsung = "Samsung".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.Samsung]
    
    inline def UCAndroid: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.UCAndroid = "UCAndroid".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.UCAndroid]
    
    inline def and_chr: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.and_chr = "and_chr".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.and_chr]
    
    inline def and_ff: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.and_ff = "and_ff".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.and_ff]
    
    inline def and_qq: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.and_qq = "and_qq".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.and_qq]
    
    inline def and_uc: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.and_uc = "and_uc".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.and_uc]
    
    inline def bb: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.bb = "bb".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.bb]
    
    inline def ff: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.ff = "ff".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.ff]
    
    inline def iOS: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.iOS = "iOS".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.iOS]
    
    inline def ie: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.ie = "ie".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.ie]
    
    inline def ie_mob: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.ie_mob = "ie_mob".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.ie_mob]
    
    inline def ios_saf: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.ios_saf = "ios_saf".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.ios_saf]
    
    inline def kaios: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.kaios = "kaios".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.kaios]
    
    inline def op_mini: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.op_mini = "op_mini".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.op_mini]
    
    inline def op_mob: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.op_mob = "op_mob".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.op_mob]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.babelPresetEnv.mod.BrowserslistQuery
    - js.Array[typingsJapgolly.babelPresetEnv.mod.BrowserslistQuery]
    - typingsJapgolly.babelPresetEnv.anon.keyinTargetstring
    - typingsJapgolly.babelPresetEnv.anon.Esmodules
    - typingsJapgolly.babelPresetEnv.anon.Node
    - typingsJapgolly.babelPresetEnv.anon.Safari
    - typingsJapgolly.babelPresetEnv.anon.Browsers
  */
  type TargetsOptions = _TargetsOptions | js.Array[BrowserslistQuery] | BrowserslistQuery
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.babelPresetEnv.babelPresetEnvBooleans.`false`
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.usage
    - typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.entry
  */
  trait UseBuiltInsOption extends StObject
  object UseBuiltInsOption {
    
    inline def entry: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.entry = "entry".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.entry]
    
    inline def `false`: typingsJapgolly.babelPresetEnv.babelPresetEnvBooleans.`false` = false.asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvBooleans.`false`]
    
    inline def usage: typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.usage = "usage".asInstanceOf[typingsJapgolly.babelPresetEnv.babelPresetEnvStrings.usage]
  }
  
  trait _TargetsOptions extends StObject
  object _TargetsOptions {
    
    inline def Browsers(browsers: String | js.Array[String]): typingsJapgolly.babelPresetEnv.anon.Browsers = {
      val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.babelPresetEnv.anon.Browsers]
    }
    
    inline def Esmodules(): typingsJapgolly.babelPresetEnv.anon.Esmodules = {
      val __obj = js.Dynamic.literal(esmodules = true)
      __obj.asInstanceOf[typingsJapgolly.babelPresetEnv.anon.Esmodules]
    }
    
    inline def Node(node: String | current | `true`): typingsJapgolly.babelPresetEnv.anon.Node = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.babelPresetEnv.anon.Node]
    }
    
    inline def Safari(safari: String | tp): typingsJapgolly.babelPresetEnv.anon.Safari = {
      val __obj = js.Dynamic.literal(safari = safari.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.babelPresetEnv.anon.Safari]
    }
    
    inline def keyinTargetstring(): typingsJapgolly.babelPresetEnv.anon.keyinTargetstring = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.babelPresetEnv.anon.keyinTargetstring]
    }
  }
}
