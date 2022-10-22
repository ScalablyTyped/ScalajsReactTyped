package typingsJapgolly.wdioConfig

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.NonNullable
import typingsJapgolly.std.Record
import typingsJapgolly.wdioConfig.anon.RequiredTestrunner
import typingsJapgolly.wdioConfig.buildTypesMod.ModuleRequireService
import typingsJapgolly.wdioConfig.buildTypesMod.PathService
import typingsJapgolly.wdioConfig.wdioConfigStrings.local
import typingsJapgolly.wdioTypes.anon.Http
import typingsJapgolly.wdioTypes.anon.OmitTestrunnercapabilitieAfter
import typingsJapgolly.wdioTypes.buildCapabilitiesMod.DesiredCapabilities
import typingsJapgolly.wdioTypes.buildCapabilitiesMod.RemoteCapabilities
import typingsJapgolly.wdioTypes.buildCapabilitiesMod.RemoteCapability
import typingsJapgolly.wdioTypes.buildCapabilitiesMod.W3CCapabilities
import typingsJapgolly.wdioTypes.buildFrameworksMod.Suite
import typingsJapgolly.wdioTypes.buildFrameworksMod.Test
import typingsJapgolly.wdioTypes.buildFrameworksMod.TestResult
import typingsJapgolly.wdioTypes.buildOptionsMod.AutoCompileConfig
import typingsJapgolly.wdioTypes.buildOptionsMod.RequestLibOptions
import typingsJapgolly.wdioTypes.buildOptionsMod.RequestLibResponse
import typingsJapgolly.wdioTypes.buildOptionsMod.SauceRegions
import typingsJapgolly.wdioTypes.buildOptionsMod.SupportedProtocols
import typingsJapgolly.wdioTypes.buildOptionsMod.WebDriverLogTypes
import typingsJapgolly.wdioTypes.buildReportersMod.ReporterEntry
import typingsJapgolly.wdioTypes.buildServicesMod.Hooks
import typingsJapgolly.wdioTypes.buildServicesMod.ServiceEntry
import typingsJapgolly.wdioTypes.mod.global.WebdriverIO.CucumberOpts
import typingsJapgolly.wdioTypes.mod.global.WebdriverIO.JasmineOpts
import typingsJapgolly.wdioTypes.mod.global.WebdriverIO.MochaOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibConfigParserMod {
  
  @JSImport("@wdio/config/build/lib/ConfigParser", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ConfigParser {
    def this(_pathService: PathService) = this()
    def this(_pathService: Unit, _moduleRequireService: ModuleRequireService) = this()
    def this(_pathService: PathService, _moduleRequireService: ModuleRequireService) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@wdio/config/build/lib/ConfigParser", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * returns a flattened list of globbed files
      *
      * @param  {String[] | String[][]} filenames list of files to glob
      * @param  {Boolean} flag to indicate omission of warnings
      * @param  {FileSystemPathService} file system path service for expanding globbed file names
      * @param  {number} hierarchy depth to prevent recursive calling beyond a depth of 1
      * @return {String[] | String[][]} list of files
      */
    inline def getFilePaths(patterns: js.Array[Spec]): js.Array[Spec] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[Spec]]
    inline def getFilePaths(patterns: js.Array[Spec], omitWarnings: Boolean): js.Array[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any], omitWarnings.asInstanceOf[js.Any])).asInstanceOf[js.Array[Spec]]
    inline def getFilePaths(patterns: js.Array[Spec], omitWarnings: Boolean, findAndGlob: Unit, hierarchyDepth: Double): js.Array[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any], omitWarnings.asInstanceOf[js.Any], findAndGlob.asInstanceOf[js.Any], hierarchyDepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Spec]]
    inline def getFilePaths(patterns: js.Array[Spec], omitWarnings: Boolean, findAndGlob: PathService): js.Array[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any], omitWarnings.asInstanceOf[js.Any], findAndGlob.asInstanceOf[js.Any])).asInstanceOf[js.Array[Spec]]
    inline def getFilePaths(patterns: js.Array[Spec], omitWarnings: Boolean, findAndGlob: PathService, hierarchyDepth: Double): js.Array[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any], omitWarnings.asInstanceOf[js.Any], findAndGlob.asInstanceOf[js.Any], hierarchyDepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Spec]]
    inline def getFilePaths(patterns: js.Array[Spec], omitWarnings: Unit, findAndGlob: Unit, hierarchyDepth: Double): js.Array[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any], omitWarnings.asInstanceOf[js.Any], findAndGlob.asInstanceOf[js.Any], hierarchyDepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Spec]]
    inline def getFilePaths(patterns: js.Array[Spec], omitWarnings: Unit, findAndGlob: PathService): js.Array[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any], omitWarnings.asInstanceOf[js.Any], findAndGlob.asInstanceOf[js.Any])).asInstanceOf[js.Array[Spec]]
    inline def getFilePaths(patterns: js.Array[Spec], omitWarnings: Unit, findAndGlob: PathService, hierarchyDepth: Double): js.Array[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any], omitWarnings.asInstanceOf[js.Any], findAndGlob.asInstanceOf[js.Any], hierarchyDepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Spec]]
  }
  
  @js.native
  trait ConfigParser extends StObject {
    
    /* private */ var _capabilities: Any = js.native
    
    /* private */ var _config: Any = js.native
    
    /* private */ var _moduleRequireService: Any = js.native
    
    /* private */ var _pathService: Any = js.native
    
    /**
      * merges config file with default values
      * @param {String} filename path of file relative to current directory
      */
    def addConfigFile(filename: String): Unit = js.native
    
    /**
      * Add hooks from an existing service to the runner config.
      * @param {Object} service - an object that contains hook methods.
      */
    def addService(service: Hooks): Unit = js.native
    
    def autoCompile(): Unit = js.native
    
    /**
      * returns specs files with the excludes filtered
      *
      * @param  {String[] | String[][]} spec files -  list of spec files
      * @param  {String[]} exclude files -  list of exclude files
      * @return {String[] | String[][]} list of spec files with excludes removed
      */
    def filterSpecs(specs: js.Array[Spec], exclude: js.Array[String]): js.Array[Spec] = js.native
    
    /**
      * return capabilities
      */
    def getCapabilities(): DesiredCapabilities | W3CCapabilities | RemoteCapabilities = js.native
    def getCapabilities(i: Double): DesiredCapabilities | W3CCapabilities | RemoteCapabilities = js.native
    
    /**
      * return configs
      */
    def getConfig(): RequiredTestrunner = js.native
    
    /**
      * get excluded files from config pattern
      */
    def getSpecs(): js.Array[Spec] = js.native
    def getSpecs(capSpecs: js.Array[String]): js.Array[Spec] = js.native
    def getSpecs(capSpecs: js.Array[String], capExclude: js.Array[String]): js.Array[Spec] = js.native
    def getSpecs(capSpecs: Unit, capExclude: js.Array[String]): js.Array[Spec] = js.native
    
    /**
      * merge external object with config object
      * @param  {Object} object  desired object to merge into the config object
      */
    def merge(): Unit = js.native
    def merge(`object`: MergeConfig): Unit = js.native
    
    /**
      * sets config attribute with file paths from filtering
      * options from cli argument
      *
      * @param  {String[]} cliArgFileList  list of files in a string form
      * @param  {Object} config  config object that stores the spec and exclude attributes
      * cli argument
      * @return {String[]} List of files that should be included or excluded
      */
    def setFilePathToFilterOptions(cliArgFileList: js.Array[String], config: js.Array[Spec]): js.Array[String] = js.native
  }
  
  /* Inlined parent std.Omit<std.Partial<@wdio/config.@wdio/config/build/lib/ConfigParser.TestrunnerOptionsWithParameters>, 'specs' | 'exclude'> */
  trait MergeConfig extends StObject {
    
    var after: js.UndefOr[
        (js.Function3[
          /* result */ Double, 
          /* capabilities */ RemoteCapability, 
          /* specs */ js.Array[String], 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function3[
                /* result */ Double, 
                /* capabilities */ RemoteCapability, 
                /* specs */ js.Array[String], 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var afterCommand: js.UndefOr[
        (js.Function4[
          /* commandName */ String, 
          /* args */ js.Array[Any], 
          /* result */ Any, 
          /* error */ js.UndefOr[js.Error], 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function4[
                /* commandName */ String, 
                /* args */ js.Array[Any], 
                /* result */ Any, 
                /* error */ js.UndefOr[js.Error], 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var afterHook: js.UndefOr[
        (js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]) | (js.Array[
          NonNullable[
            js.UndefOr[js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]]
          ]
        ])
      ] = js.undefined
    
    var afterSession: js.UndefOr[
        (js.Function3[
          /* config */ this.type, 
          /* capabilities */ RemoteCapability, 
          /* specs */ js.Array[String], 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function3[
                /* config */ this.type, 
                /* capabilities */ RemoteCapability, 
                /* specs */ js.Array[String], 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var afterSuite: js.UndefOr[
        (js.Function1[/* suite */ Suite, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function1[/* suite */ Suite, Unit]]]])
      ] = js.undefined
    
    var afterTest: js.UndefOr[
        (js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]) | (js.Array[
          NonNullable[
            js.UndefOr[js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]]
          ]
        ])
      ] = js.undefined
    
    var agent: js.UndefOr[Http] = js.undefined
    
    var autoCompileOpts: js.UndefOr[AutoCompileConfig] = js.undefined
    
    var automationProtocol: js.UndefOr[SupportedProtocols] = js.undefined
    
    var bail: js.UndefOr[Double] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var before: js.UndefOr[
        (js.Function3[
          /* capabilities */ RemoteCapability, 
          /* specs */ js.Array[String], 
          /* browser */ Any, 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function3[
                /* capabilities */ RemoteCapability, 
                /* specs */ js.Array[String], 
                /* browser */ Any, 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var beforeCommand: js.UndefOr[
        (js.Function2[/* commandName */ String, /* args */ js.Array[Any], Unit]) | (js.Array[
          NonNullable[
            js.UndefOr[js.Function2[/* commandName */ String, /* args */ js.Array[Any], Unit]]
          ]
        ])
      ] = js.undefined
    
    var beforeHook: js.UndefOr[
        (js.Function2[/* test */ Any, /* context */ Any, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function2[/* test */ Any, /* context */ Any, Unit]]]])
      ] = js.undefined
    
    var beforeSession: js.UndefOr[
        (js.Function4[
          /* config */ OmitTestrunnercapabilitieAfter, 
          /* capabilities */ RemoteCapability, 
          /* specs */ js.Array[String], 
          /* cid */ String, 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function4[
                /* config */ OmitTestrunnercapabilitieAfter, 
                /* capabilities */ RemoteCapability, 
                /* specs */ js.Array[String], 
                /* cid */ String, 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var beforeSuite: js.UndefOr[
        (js.Function1[/* suite */ Suite, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function1[/* suite */ Suite, Unit]]]])
      ] = js.undefined
    
    var beforeTest: js.UndefOr[
        (js.Function2[/* test */ Test, /* context */ Any, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function2[/* test */ Test, /* context */ Any, Unit]]]])
      ] = js.undefined
    
    var capabilities: js.UndefOr[RemoteCapabilities] = js.undefined
    
    var connectionRetryCount: js.UndefOr[Double] = js.undefined
    
    var connectionRetryTimeout: js.UndefOr[Double] = js.undefined
    
    var cucumberFeaturesWithLineNumbers: js.UndefOr[js.Array[String]] = js.undefined
    
    var cucumberOpts: js.UndefOr[CucumberOpts] = js.undefined
    
    var enableDirectConnect: js.UndefOr[Boolean] = js.undefined
    
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var execArgv: js.UndefOr[js.Array[String]] = js.undefined
    
    var filesToWatch: js.UndefOr[js.Array[String]] = js.undefined
    
    var framework: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var headless: js.UndefOr[Boolean] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var jasmineOpts: js.UndefOr[JasmineOpts] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var logLevel: js.UndefOr[WebDriverLogTypes] = js.undefined
    
    var logLevels: js.UndefOr[Record[String, WebDriverLogTypes]] = js.undefined
    
    var maxInstances: js.UndefOr[Double] = js.undefined
    
    var maxInstancesPerCapability: js.UndefOr[Double] = js.undefined
    
    var mochaOpts: js.UndefOr[MochaOpts] = js.undefined
    
    var onComplete: js.UndefOr[
        (js.Function4[
          /* exitCode */ Double, 
          /* config */ OmitTestrunnercapabilitieAfter, 
          /* capabilities */ RemoteCapabilities, 
          /* results */ Any, 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function4[
                /* exitCode */ Double, 
                /* config */ OmitTestrunnercapabilitieAfter, 
                /* capabilities */ RemoteCapabilities, 
                /* results */ Any, 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var onPrepare: js.UndefOr[
        (js.Function2[/* config */ this.type, /* capabilities */ RemoteCapabilities, Unit]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function2[/* config */ this.type, /* capabilities */ RemoteCapabilities, Unit]
            ]
          ]
        ])
      ] = js.undefined
    
    var onReload: js.UndefOr[
        (js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]) | (js.Array[
          NonNullable[
            js.UndefOr[js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]]
          ]
        ])
      ] = js.undefined
    
    var onWorkerEnd: js.UndefOr[
        (js.Function4[
          /* cid */ String, 
          /* exitCode */ Double, 
          /* specs */ js.Array[String], 
          /* retries */ Double, 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function4[
                /* cid */ String, 
                /* exitCode */ Double, 
                /* specs */ js.Array[String], 
                /* retries */ Double, 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var onWorkerStart: js.UndefOr[
        (js.Function5[
          /* cid */ String, 
          /* caps */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          /* args */ this.type, 
          /* execArgv */ js.Array[String], 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function5[
                /* cid */ String, 
                /* caps */ DesiredCapabilities, 
                /* specs */ js.Array[String], 
                /* args */ this.type, 
                /* execArgv */ js.Array[String], 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var outputDir: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var queryParams: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var region: js.UndefOr[SauceRegions] = js.undefined
    
    var reporterSyncInterval: js.UndefOr[Double] = js.undefined
    
    var reporterSyncTimeout: js.UndefOr[Double] = js.undefined
    
    var reporters: js.UndefOr[js.Array[ReporterEntry]] = js.undefined
    
    var runner: js.UndefOr[local] = js.undefined
    
    var runnerEnv: js.UndefOr[Record[String, Any]] = js.undefined
    
    var services: js.UndefOr[js.Array[ServiceEntry]] = js.undefined
    
    var spec: js.UndefOr[js.Array[String]] = js.undefined
    
    var specFileRetries: js.UndefOr[Double] = js.undefined
    
    var specFileRetriesDeferred: js.UndefOr[Boolean] = js.undefined
    
    var specFileRetriesDelay: js.UndefOr[Double] = js.undefined
    
    var specs: js.UndefOr[js.Array[Spec]] = js.undefined
    
    var strictSSL: js.UndefOr[Boolean] = js.undefined
    
    var suite: js.UndefOr[js.Array[String]] = js.undefined
    
    var suites: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
    
    var transformRequest: js.UndefOr[js.Function1[/* requestOptions */ RequestLibOptions, RequestLibOptions]] = js.undefined
    
    var transformResponse: js.UndefOr[
        js.Function2[
          /* response */ RequestLibResponse, 
          /* requestOptions */ RequestLibOptions, 
          RequestLibResponse
        ]
      ] = js.undefined
    
    var user: js.UndefOr[String] = js.undefined
    
    var waitforInterval: js.UndefOr[Double] = js.undefined
    
    var waitforTimeout: js.UndefOr[Double] = js.undefined
    
    var watch: js.UndefOr[Boolean] = js.undefined
  }
  object MergeConfig {
    
    inline def apply(): MergeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeConfig]
    }
    
    extension [Self <: MergeConfig](x: Self) {
      
      inline def setAfter(
        value: (js.Function3[
              /* result */ Double, 
              /* capabilities */ RemoteCapability, 
              /* specs */ js.Array[String], 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function3[
                    /* result */ Double, 
                    /* capabilities */ RemoteCapability, 
                    /* specs */ js.Array[String], 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterCommand(
        value: (js.Function4[
              /* commandName */ String, 
              /* args */ js.Array[Any], 
              /* result */ Any, 
              /* error */ js.UndefOr[js.Error], 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function4[
                    /* commandName */ String, 
                    /* args */ js.Array[Any], 
                    /* result */ Any, 
                    /* error */ js.UndefOr[js.Error], 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "afterCommand", value.asInstanceOf[js.Any])
      
      inline def setAfterCommandFunction4(
        value: (/* commandName */ String, /* args */ js.Array[Any], /* result */ Any, /* error */ js.UndefOr[js.Error]) => Callback
      ): Self = StObject.set(x, "afterCommand", js.Any.fromFunction4((t0: /* commandName */ String, t1: /* args */ js.Array[Any], t2: /* result */ Any, t3: /* error */ js.UndefOr[js.Error]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setAfterCommandUndefined: Self = StObject.set(x, "afterCommand", js.undefined)
      
      inline def setAfterCommandVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function4[
                  /* commandName */ String, 
                  /* args */ js.Array[Any], 
                  /* result */ Any, 
                  /* error */ js.UndefOr[js.Error], 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "afterCommand", js.Array(value*))
      
      inline def setAfterFunction3(
        value: (/* result */ Double, /* capabilities */ RemoteCapability, /* specs */ js.Array[String]) => Callback
      ): Self = StObject.set(x, "after", js.Any.fromFunction3((t0: /* result */ Double, t1: /* capabilities */ RemoteCapability, t2: /* specs */ js.Array[String]) => (value(t0, t1, t2)).runNow()))
      
      inline def setAfterHook(
        value: (js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]) | (js.Array[
              NonNullable[
                js.UndefOr[js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]]
              ]
            ])
      ): Self = StObject.set(x, "afterHook", value.asInstanceOf[js.Any])
      
      inline def setAfterHookFunction3(value: (/* test */ Test, /* context */ Any, /* result */ TestResult) => Callback): Self = StObject.set(x, "afterHook", js.Any.fromFunction3((t0: /* test */ Test, t1: /* context */ Any, t2: /* result */ TestResult) => (value(t0, t1, t2)).runNow()))
      
      inline def setAfterHookUndefined: Self = StObject.set(x, "afterHook", js.undefined)
      
      inline def setAfterHookVarargs(
        value: (NonNullable[
              js.UndefOr[js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]]
            ])*
      ): Self = StObject.set(x, "afterHook", js.Array(value*))
      
      inline def setAfterSession(
        value: (js.Function3[MergeConfig, /* capabilities */ RemoteCapability, /* specs */ js.Array[String], Unit]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function3[MergeConfig, /* capabilities */ RemoteCapability, /* specs */ js.Array[String], Unit]
                ]
              ]
            ])
      ): Self = StObject.set(x, "afterSession", value.asInstanceOf[js.Any])
      
      inline def setAfterSessionFunction3(
        value: (MergeConfig, /* capabilities */ RemoteCapability, /* specs */ js.Array[String]) => Callback
      ): Self = StObject.set(x, "afterSession", js.Any.fromFunction3((t0: MergeConfig, t1: /* capabilities */ RemoteCapability, t2: /* specs */ js.Array[String]) => (value(t0, t1, t2)).runNow()))
      
      inline def setAfterSessionUndefined: Self = StObject.set(x, "afterSession", js.undefined)
      
      inline def setAfterSessionVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function3[MergeConfig, /* capabilities */ RemoteCapability, /* specs */ js.Array[String], Unit]
              ]
            ])*
      ): Self = StObject.set(x, "afterSession", js.Array(value*))
      
      inline def setAfterSuite(
        value: (js.Function1[/* suite */ Suite, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function1[/* suite */ Suite, Unit]]]])
      ): Self = StObject.set(x, "afterSuite", value.asInstanceOf[js.Any])
      
      inline def setAfterSuiteFunction1(value: /* suite */ Suite => Callback): Self = StObject.set(x, "afterSuite", js.Any.fromFunction1((t0: /* suite */ Suite) => value(t0).runNow()))
      
      inline def setAfterSuiteUndefined: Self = StObject.set(x, "afterSuite", js.undefined)
      
      inline def setAfterSuiteVarargs(value: (NonNullable[js.UndefOr[js.Function1[/* suite */ Suite, Unit]]])*): Self = StObject.set(x, "afterSuite", js.Array(value*))
      
      inline def setAfterTest(
        value: (js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]) | (js.Array[
              NonNullable[
                js.UndefOr[js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]]
              ]
            ])
      ): Self = StObject.set(x, "afterTest", value.asInstanceOf[js.Any])
      
      inline def setAfterTestFunction3(value: (/* test */ Test, /* context */ Any, /* result */ TestResult) => Callback): Self = StObject.set(x, "afterTest", js.Any.fromFunction3((t0: /* test */ Test, t1: /* context */ Any, t2: /* result */ TestResult) => (value(t0, t1, t2)).runNow()))
      
      inline def setAfterTestUndefined: Self = StObject.set(x, "afterTest", js.undefined)
      
      inline def setAfterTestVarargs(
        value: (NonNullable[
              js.UndefOr[js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]]
            ])*
      ): Self = StObject.set(x, "afterTest", js.Array(value*))
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAfterVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function3[
                  /* result */ Double, 
                  /* capabilities */ RemoteCapability, 
                  /* specs */ js.Array[String], 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "after", js.Array(value*))
      
      inline def setAgent(value: Http): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAutoCompileOpts(value: AutoCompileConfig): Self = StObject.set(x, "autoCompileOpts", value.asInstanceOf[js.Any])
      
      inline def setAutoCompileOptsUndefined: Self = StObject.set(x, "autoCompileOpts", js.undefined)
      
      inline def setAutomationProtocol(value: SupportedProtocols): Self = StObject.set(x, "automationProtocol", value.asInstanceOf[js.Any])
      
      inline def setAutomationProtocolUndefined: Self = StObject.set(x, "automationProtocol", js.undefined)
      
      inline def setBail(value: Double): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
      
      inline def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setBefore(
        value: (js.Function3[
              /* capabilities */ RemoteCapability, 
              /* specs */ js.Array[String], 
              /* browser */ Any, 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function3[
                    /* capabilities */ RemoteCapability, 
                    /* specs */ js.Array[String], 
                    /* browser */ Any, 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeCommand(
        value: (js.Function2[/* commandName */ String, /* args */ js.Array[Any], Unit]) | (js.Array[
              NonNullable[
                js.UndefOr[js.Function2[/* commandName */ String, /* args */ js.Array[Any], Unit]]
              ]
            ])
      ): Self = StObject.set(x, "beforeCommand", value.asInstanceOf[js.Any])
      
      inline def setBeforeCommandFunction2(value: (/* commandName */ String, /* args */ js.Array[Any]) => Callback): Self = StObject.set(x, "beforeCommand", js.Any.fromFunction2((t0: /* commandName */ String, t1: /* args */ js.Array[Any]) => (value(t0, t1)).runNow()))
      
      inline def setBeforeCommandUndefined: Self = StObject.set(x, "beforeCommand", js.undefined)
      
      inline def setBeforeCommandVarargs(
        value: (NonNullable[
              js.UndefOr[js.Function2[/* commandName */ String, /* args */ js.Array[Any], Unit]]
            ])*
      ): Self = StObject.set(x, "beforeCommand", js.Array(value*))
      
      inline def setBeforeFunction3(
        value: (/* capabilities */ RemoteCapability, /* specs */ js.Array[String], /* browser */ Any) => Callback
      ): Self = StObject.set(x, "before", js.Any.fromFunction3((t0: /* capabilities */ RemoteCapability, t1: /* specs */ js.Array[String], t2: /* browser */ Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setBeforeHook(
        value: (js.Function2[/* test */ Any, /* context */ Any, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function2[/* test */ Any, /* context */ Any, Unit]]]])
      ): Self = StObject.set(x, "beforeHook", value.asInstanceOf[js.Any])
      
      inline def setBeforeHookFunction2(value: (/* test */ Any, /* context */ Any) => Callback): Self = StObject.set(x, "beforeHook", js.Any.fromFunction2((t0: /* test */ Any, t1: /* context */ Any) => (value(t0, t1)).runNow()))
      
      inline def setBeforeHookUndefined: Self = StObject.set(x, "beforeHook", js.undefined)
      
      inline def setBeforeHookVarargs(value: (NonNullable[js.UndefOr[js.Function2[/* test */ Any, /* context */ Any, Unit]]])*): Self = StObject.set(x, "beforeHook", js.Array(value*))
      
      inline def setBeforeSession(
        value: (js.Function4[
              /* config */ OmitTestrunnercapabilitieAfter, 
              /* capabilities */ RemoteCapability, 
              /* specs */ js.Array[String], 
              /* cid */ String, 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function4[
                    /* config */ OmitTestrunnercapabilitieAfter, 
                    /* capabilities */ RemoteCapability, 
                    /* specs */ js.Array[String], 
                    /* cid */ String, 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "beforeSession", value.asInstanceOf[js.Any])
      
      inline def setBeforeSessionFunction4(
        value: (/* config */ OmitTestrunnercapabilitieAfter, /* capabilities */ RemoteCapability, /* specs */ js.Array[String], /* cid */ String) => Callback
      ): Self = StObject.set(x, "beforeSession", js.Any.fromFunction4((t0: /* config */ OmitTestrunnercapabilitieAfter, t1: /* capabilities */ RemoteCapability, t2: /* specs */ js.Array[String], t3: /* cid */ String) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setBeforeSessionUndefined: Self = StObject.set(x, "beforeSession", js.undefined)
      
      inline def setBeforeSessionVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function4[
                  /* config */ OmitTestrunnercapabilitieAfter, 
                  /* capabilities */ RemoteCapability, 
                  /* specs */ js.Array[String], 
                  /* cid */ String, 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "beforeSession", js.Array(value*))
      
      inline def setBeforeSuite(
        value: (js.Function1[/* suite */ Suite, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function1[/* suite */ Suite, Unit]]]])
      ): Self = StObject.set(x, "beforeSuite", value.asInstanceOf[js.Any])
      
      inline def setBeforeSuiteFunction1(value: /* suite */ Suite => Callback): Self = StObject.set(x, "beforeSuite", js.Any.fromFunction1((t0: /* suite */ Suite) => value(t0).runNow()))
      
      inline def setBeforeSuiteUndefined: Self = StObject.set(x, "beforeSuite", js.undefined)
      
      inline def setBeforeSuiteVarargs(value: (NonNullable[js.UndefOr[js.Function1[/* suite */ Suite, Unit]]])*): Self = StObject.set(x, "beforeSuite", js.Array(value*))
      
      inline def setBeforeTest(
        value: (js.Function2[/* test */ Test, /* context */ Any, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function2[/* test */ Test, /* context */ Any, Unit]]]])
      ): Self = StObject.set(x, "beforeTest", value.asInstanceOf[js.Any])
      
      inline def setBeforeTestFunction2(value: (/* test */ Test, /* context */ Any) => Callback): Self = StObject.set(x, "beforeTest", js.Any.fromFunction2((t0: /* test */ Test, t1: /* context */ Any) => (value(t0, t1)).runNow()))
      
      inline def setBeforeTestUndefined: Self = StObject.set(x, "beforeTest", js.undefined)
      
      inline def setBeforeTestVarargs(value: (NonNullable[js.UndefOr[js.Function2[/* test */ Test, /* context */ Any, Unit]]])*): Self = StObject.set(x, "beforeTest", js.Array(value*))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBeforeVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function3[
                  /* capabilities */ RemoteCapability, 
                  /* specs */ js.Array[String], 
                  /* browser */ Any, 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "before", js.Array(value*))
      
      inline def setCapabilities(value: RemoteCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
      
      inline def setCapabilitiesVarargs(value: (DesiredCapabilities | W3CCapabilities)*): Self = StObject.set(x, "capabilities", js.Array(value*))
      
      inline def setConnectionRetryCount(value: Double): Self = StObject.set(x, "connectionRetryCount", value.asInstanceOf[js.Any])
      
      inline def setConnectionRetryCountUndefined: Self = StObject.set(x, "connectionRetryCount", js.undefined)
      
      inline def setConnectionRetryTimeout(value: Double): Self = StObject.set(x, "connectionRetryTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectionRetryTimeoutUndefined: Self = StObject.set(x, "connectionRetryTimeout", js.undefined)
      
      inline def setCucumberFeaturesWithLineNumbers(value: js.Array[String]): Self = StObject.set(x, "cucumberFeaturesWithLineNumbers", value.asInstanceOf[js.Any])
      
      inline def setCucumberFeaturesWithLineNumbersUndefined: Self = StObject.set(x, "cucumberFeaturesWithLineNumbers", js.undefined)
      
      inline def setCucumberFeaturesWithLineNumbersVarargs(value: String*): Self = StObject.set(x, "cucumberFeaturesWithLineNumbers", js.Array(value*))
      
      inline def setCucumberOpts(value: CucumberOpts): Self = StObject.set(x, "cucumberOpts", value.asInstanceOf[js.Any])
      
      inline def setCucumberOptsUndefined: Self = StObject.set(x, "cucumberOpts", js.undefined)
      
      inline def setEnableDirectConnect(value: Boolean): Self = StObject.set(x, "enableDirectConnect", value.asInstanceOf[js.Any])
      
      inline def setEnableDirectConnectUndefined: Self = StObject.set(x, "enableDirectConnect", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setExecArgv(value: js.Array[String]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
      
      inline def setExecArgvUndefined: Self = StObject.set(x, "execArgv", js.undefined)
      
      inline def setExecArgvVarargs(value: String*): Self = StObject.set(x, "execArgv", js.Array(value*))
      
      inline def setFilesToWatch(value: js.Array[String]): Self = StObject.set(x, "filesToWatch", value.asInstanceOf[js.Any])
      
      inline def setFilesToWatchUndefined: Self = StObject.set(x, "filesToWatch", js.undefined)
      
      inline def setFilesToWatchVarargs(value: String*): Self = StObject.set(x, "filesToWatch", js.Array(value*))
      
      inline def setFramework(value: String): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
      
      inline def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setJasmineOpts(value: JasmineOpts): Self = StObject.set(x, "jasmineOpts", value.asInstanceOf[js.Any])
      
      inline def setJasmineOptsUndefined: Self = StObject.set(x, "jasmineOpts", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLogLevel(value: WebDriverLogTypes): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setLogLevels(value: Record[String, WebDriverLogTypes]): Self = StObject.set(x, "logLevels", value.asInstanceOf[js.Any])
      
      inline def setLogLevelsUndefined: Self = StObject.set(x, "logLevels", js.undefined)
      
      inline def setMaxInstances(value: Double): Self = StObject.set(x, "maxInstances", value.asInstanceOf[js.Any])
      
      inline def setMaxInstancesPerCapability(value: Double): Self = StObject.set(x, "maxInstancesPerCapability", value.asInstanceOf[js.Any])
      
      inline def setMaxInstancesPerCapabilityUndefined: Self = StObject.set(x, "maxInstancesPerCapability", js.undefined)
      
      inline def setMaxInstancesUndefined: Self = StObject.set(x, "maxInstances", js.undefined)
      
      inline def setMochaOpts(value: MochaOpts): Self = StObject.set(x, "mochaOpts", value.asInstanceOf[js.Any])
      
      inline def setMochaOptsUndefined: Self = StObject.set(x, "mochaOpts", js.undefined)
      
      inline def setOnComplete(
        value: (js.Function4[
              /* exitCode */ Double, 
              /* config */ OmitTestrunnercapabilitieAfter, 
              /* capabilities */ RemoteCapabilities, 
              /* results */ Any, 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function4[
                    /* exitCode */ Double, 
                    /* config */ OmitTestrunnercapabilitieAfter, 
                    /* capabilities */ RemoteCapabilities, 
                    /* results */ Any, 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
      
      inline def setOnCompleteFunction4(
        value: (/* exitCode */ Double, /* config */ OmitTestrunnercapabilitieAfter, /* capabilities */ RemoteCapabilities, /* results */ Any) => Callback
      ): Self = StObject.set(x, "onComplete", js.Any.fromFunction4((t0: /* exitCode */ Double, t1: /* config */ OmitTestrunnercapabilitieAfter, t2: /* capabilities */ RemoteCapabilities, t3: /* results */ Any) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnCompleteVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function4[
                  /* exitCode */ Double, 
                  /* config */ OmitTestrunnercapabilitieAfter, 
                  /* capabilities */ RemoteCapabilities, 
                  /* results */ Any, 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "onComplete", js.Array(value*))
      
      inline def setOnPrepare(
        value: (js.Function2[MergeConfig, /* capabilities */ RemoteCapabilities, Unit]) | (js.Array[
              NonNullable[
                js.UndefOr[js.Function2[MergeConfig, /* capabilities */ RemoteCapabilities, Unit]]
              ]
            ])
      ): Self = StObject.set(x, "onPrepare", value.asInstanceOf[js.Any])
      
      inline def setOnPrepareFunction2(value: (MergeConfig, /* capabilities */ RemoteCapabilities) => Callback): Self = StObject.set(x, "onPrepare", js.Any.fromFunction2((t0: MergeConfig, t1: /* capabilities */ RemoteCapabilities) => (value(t0, t1)).runNow()))
      
      inline def setOnPrepareUndefined: Self = StObject.set(x, "onPrepare", js.undefined)
      
      inline def setOnPrepareVarargs(
        value: (NonNullable[
              js.UndefOr[js.Function2[MergeConfig, /* capabilities */ RemoteCapabilities, Unit]]
            ])*
      ): Self = StObject.set(x, "onPrepare", js.Array(value*))
      
      inline def setOnReload(
        value: (js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]) | (js.Array[
              NonNullable[
                js.UndefOr[js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]]
              ]
            ])
      ): Self = StObject.set(x, "onReload", value.asInstanceOf[js.Any])
      
      inline def setOnReloadFunction2(value: (/* oldSessionId */ String, /* newSessionId */ String) => Callback): Self = StObject.set(x, "onReload", js.Any.fromFunction2((t0: /* oldSessionId */ String, t1: /* newSessionId */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnReloadUndefined: Self = StObject.set(x, "onReload", js.undefined)
      
      inline def setOnReloadVarargs(
        value: (NonNullable[
              js.UndefOr[js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]]
            ])*
      ): Self = StObject.set(x, "onReload", js.Array(value*))
      
      inline def setOnWorkerEnd(
        value: (js.Function4[
              /* cid */ String, 
              /* exitCode */ Double, 
              /* specs */ js.Array[String], 
              /* retries */ Double, 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function4[
                    /* cid */ String, 
                    /* exitCode */ Double, 
                    /* specs */ js.Array[String], 
                    /* retries */ Double, 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "onWorkerEnd", value.asInstanceOf[js.Any])
      
      inline def setOnWorkerEndFunction4(
        value: (/* cid */ String, /* exitCode */ Double, /* specs */ js.Array[String], /* retries */ Double) => Callback
      ): Self = StObject.set(x, "onWorkerEnd", js.Any.fromFunction4((t0: /* cid */ String, t1: /* exitCode */ Double, t2: /* specs */ js.Array[String], t3: /* retries */ Double) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnWorkerEndUndefined: Self = StObject.set(x, "onWorkerEnd", js.undefined)
      
      inline def setOnWorkerEndVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function4[
                  /* cid */ String, 
                  /* exitCode */ Double, 
                  /* specs */ js.Array[String], 
                  /* retries */ Double, 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "onWorkerEnd", js.Array(value*))
      
      inline def setOnWorkerStart(
        value: (js.Function5[
              /* cid */ String, 
              /* caps */ DesiredCapabilities, 
              /* specs */ js.Array[String], 
              MergeConfig, 
              /* execArgv */ js.Array[String], 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function5[
                    /* cid */ String, 
                    /* caps */ DesiredCapabilities, 
                    /* specs */ js.Array[String], 
                    MergeConfig, 
                    /* execArgv */ js.Array[String], 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "onWorkerStart", value.asInstanceOf[js.Any])
      
      inline def setOnWorkerStartFunction5(
        value: (/* cid */ String, /* caps */ DesiredCapabilities, /* specs */ js.Array[String], MergeConfig, /* execArgv */ js.Array[String]) => Callback
      ): Self = StObject.set(x, "onWorkerStart", js.Any.fromFunction5((t0: /* cid */ String, t1: /* caps */ DesiredCapabilities, t2: /* specs */ js.Array[String], t3: MergeConfig, t4: /* execArgv */ js.Array[String]) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setOnWorkerStartUndefined: Self = StObject.set(x, "onWorkerStart", js.undefined)
      
      inline def setOnWorkerStartVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function5[
                  /* cid */ String, 
                  /* caps */ DesiredCapabilities, 
                  /* specs */ js.Array[String], 
                  MergeConfig, 
                  /* execArgv */ js.Array[String], 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "onWorkerStart", js.Array(value*))
      
      inline def setOutputDir(value: String): Self = StObject.set(x, "outputDir", value.asInstanceOf[js.Any])
      
      inline def setOutputDirUndefined: Self = StObject.set(x, "outputDir", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setQueryParams(value: StringDictionary[String]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      inline def setRegion(value: SauceRegions): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setReporterSyncInterval(value: Double): Self = StObject.set(x, "reporterSyncInterval", value.asInstanceOf[js.Any])
      
      inline def setReporterSyncIntervalUndefined: Self = StObject.set(x, "reporterSyncInterval", js.undefined)
      
      inline def setReporterSyncTimeout(value: Double): Self = StObject.set(x, "reporterSyncTimeout", value.asInstanceOf[js.Any])
      
      inline def setReporterSyncTimeoutUndefined: Self = StObject.set(x, "reporterSyncTimeout", js.undefined)
      
      inline def setReporters(value: js.Array[ReporterEntry]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      inline def setReportersVarargs(value: ReporterEntry*): Self = StObject.set(x, "reporters", js.Array(value*))
      
      inline def setRunner(value: local): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
      
      inline def setRunnerEnv(value: Record[String, Any]): Self = StObject.set(x, "runnerEnv", value.asInstanceOf[js.Any])
      
      inline def setRunnerEnvUndefined: Self = StObject.set(x, "runnerEnv", js.undefined)
      
      inline def setRunnerUndefined: Self = StObject.set(x, "runner", js.undefined)
      
      inline def setServices(value: js.Array[ServiceEntry]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
      
      inline def setServicesVarargs(value: ServiceEntry*): Self = StObject.set(x, "services", js.Array(value*))
      
      inline def setSpec(value: js.Array[String]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecFileRetries(value: Double): Self = StObject.set(x, "specFileRetries", value.asInstanceOf[js.Any])
      
      inline def setSpecFileRetriesDeferred(value: Boolean): Self = StObject.set(x, "specFileRetriesDeferred", value.asInstanceOf[js.Any])
      
      inline def setSpecFileRetriesDeferredUndefined: Self = StObject.set(x, "specFileRetriesDeferred", js.undefined)
      
      inline def setSpecFileRetriesDelay(value: Double): Self = StObject.set(x, "specFileRetriesDelay", value.asInstanceOf[js.Any])
      
      inline def setSpecFileRetriesDelayUndefined: Self = StObject.set(x, "specFileRetriesDelay", js.undefined)
      
      inline def setSpecFileRetriesUndefined: Self = StObject.set(x, "specFileRetries", js.undefined)
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      inline def setSpecVarargs(value: String*): Self = StObject.set(x, "spec", js.Array(value*))
      
      inline def setSpecs(value: js.Array[Spec]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
      
      inline def setSpecsUndefined: Self = StObject.set(x, "specs", js.undefined)
      
      inline def setSpecsVarargs(value: Spec*): Self = StObject.set(x, "specs", js.Array(value*))
      
      inline def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
      
      inline def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
      
      inline def setSuite(value: js.Array[String]): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
      
      inline def setSuiteUndefined: Self = StObject.set(x, "suite", js.undefined)
      
      inline def setSuiteVarargs(value: String*): Self = StObject.set(x, "suite", js.Array(value*))
      
      inline def setSuites(value: Record[String, js.Array[String]]): Self = StObject.set(x, "suites", value.asInstanceOf[js.Any])
      
      inline def setSuitesUndefined: Self = StObject.set(x, "suites", js.undefined)
      
      inline def setTransformRequest(value: /* requestOptions */ RequestLibOptions => RequestLibOptions): Self = StObject.set(x, "transformRequest", js.Any.fromFunction1(value))
      
      inline def setTransformRequestUndefined: Self = StObject.set(x, "transformRequest", js.undefined)
      
      inline def setTransformResponse(
        value: (/* response */ RequestLibResponse, /* requestOptions */ RequestLibOptions) => RequestLibResponse
      ): Self = StObject.set(x, "transformResponse", js.Any.fromFunction2(value))
      
      inline def setTransformResponseUndefined: Self = StObject.set(x, "transformResponse", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      
      inline def setWaitforInterval(value: Double): Self = StObject.set(x, "waitforInterval", value.asInstanceOf[js.Any])
      
      inline def setWaitforIntervalUndefined: Self = StObject.set(x, "waitforInterval", js.undefined)
      
      inline def setWaitforTimeout(value: Double): Self = StObject.set(x, "waitforTimeout", value.asInstanceOf[js.Any])
      
      inline def setWaitforTimeoutUndefined: Self = StObject.set(x, "waitforTimeout", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  type Spec = String | js.Array[String]
  
  /* Inlined parent std.Omit<@wdio/types.@wdio/types.Options.Testrunner, 'capabilities'> */
  trait TestrunnerOptionsWithParameters extends StObject {
    
    var after: js.UndefOr[
        (js.Function3[
          /* result */ Double, 
          /* capabilities */ RemoteCapability, 
          /* specs */ js.Array[String], 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function3[
                /* result */ Double, 
                /* capabilities */ RemoteCapability, 
                /* specs */ js.Array[String], 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var afterCommand: js.UndefOr[
        (js.Function4[
          /* commandName */ String, 
          /* args */ js.Array[Any], 
          /* result */ Any, 
          /* error */ js.UndefOr[js.Error], 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function4[
                /* commandName */ String, 
                /* args */ js.Array[Any], 
                /* result */ Any, 
                /* error */ js.UndefOr[js.Error], 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var afterHook: js.UndefOr[
        (js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]) | (js.Array[
          NonNullable[
            js.UndefOr[js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]]
          ]
        ])
      ] = js.undefined
    
    var afterSession: js.UndefOr[
        (js.Function3[
          /* config */ this.type, 
          /* capabilities */ RemoteCapability, 
          /* specs */ js.Array[String], 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function3[
                /* config */ this.type, 
                /* capabilities */ RemoteCapability, 
                /* specs */ js.Array[String], 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var afterSuite: js.UndefOr[
        (js.Function1[/* suite */ Suite, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function1[/* suite */ Suite, Unit]]]])
      ] = js.undefined
    
    var afterTest: js.UndefOr[
        (js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]) | (js.Array[
          NonNullable[
            js.UndefOr[js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]]
          ]
        ])
      ] = js.undefined
    
    var agent: js.UndefOr[Http] = js.undefined
    
    var autoCompileOpts: js.UndefOr[AutoCompileConfig] = js.undefined
    
    var automationProtocol: js.UndefOr[SupportedProtocols] = js.undefined
    
    var bail: js.UndefOr[Double] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var before: js.UndefOr[
        (js.Function3[
          /* capabilities */ RemoteCapability, 
          /* specs */ js.Array[String], 
          /* browser */ Any, 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function3[
                /* capabilities */ RemoteCapability, 
                /* specs */ js.Array[String], 
                /* browser */ Any, 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var beforeCommand: js.UndefOr[
        (js.Function2[/* commandName */ String, /* args */ js.Array[Any], Unit]) | (js.Array[
          NonNullable[
            js.UndefOr[js.Function2[/* commandName */ String, /* args */ js.Array[Any], Unit]]
          ]
        ])
      ] = js.undefined
    
    var beforeHook: js.UndefOr[
        (js.Function2[/* test */ Any, /* context */ Any, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function2[/* test */ Any, /* context */ Any, Unit]]]])
      ] = js.undefined
    
    var beforeSession: js.UndefOr[
        (js.Function4[
          /* config */ OmitTestrunnercapabilitieAfter, 
          /* capabilities */ RemoteCapability, 
          /* specs */ js.Array[String], 
          /* cid */ String, 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function4[
                /* config */ OmitTestrunnercapabilitieAfter, 
                /* capabilities */ RemoteCapability, 
                /* specs */ js.Array[String], 
                /* cid */ String, 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var beforeSuite: js.UndefOr[
        (js.Function1[/* suite */ Suite, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function1[/* suite */ Suite, Unit]]]])
      ] = js.undefined
    
    var beforeTest: js.UndefOr[
        (js.Function2[/* test */ Test, /* context */ Any, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function2[/* test */ Test, /* context */ Any, Unit]]]])
      ] = js.undefined
    
    var capabilities: js.UndefOr[RemoteCapabilities] = js.undefined
    
    var connectionRetryCount: js.UndefOr[Double] = js.undefined
    
    var connectionRetryTimeout: js.UndefOr[Double] = js.undefined
    
    var cucumberFeaturesWithLineNumbers: js.UndefOr[js.Array[String]] = js.undefined
    
    var cucumberOpts: js.UndefOr[CucumberOpts] = js.undefined
    
    var enableDirectConnect: js.UndefOr[Boolean] = js.undefined
    
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var execArgv: js.UndefOr[js.Array[String]] = js.undefined
    
    var filesToWatch: js.UndefOr[js.Array[String]] = js.undefined
    
    var framework: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var headless: js.UndefOr[Boolean] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var jasmineOpts: js.UndefOr[JasmineOpts] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var logLevel: js.UndefOr[WebDriverLogTypes] = js.undefined
    
    var logLevels: js.UndefOr[Record[String, WebDriverLogTypes]] = js.undefined
    
    var maxInstances: js.UndefOr[Double] = js.undefined
    
    var maxInstancesPerCapability: js.UndefOr[Double] = js.undefined
    
    var mochaOpts: js.UndefOr[MochaOpts] = js.undefined
    
    var onComplete: js.UndefOr[
        (js.Function4[
          /* exitCode */ Double, 
          /* config */ OmitTestrunnercapabilitieAfter, 
          /* capabilities */ RemoteCapabilities, 
          /* results */ Any, 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function4[
                /* exitCode */ Double, 
                /* config */ OmitTestrunnercapabilitieAfter, 
                /* capabilities */ RemoteCapabilities, 
                /* results */ Any, 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var onPrepare: js.UndefOr[
        (js.Function2[/* config */ this.type, /* capabilities */ RemoteCapabilities, Unit]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function2[/* config */ this.type, /* capabilities */ RemoteCapabilities, Unit]
            ]
          ]
        ])
      ] = js.undefined
    
    var onReload: js.UndefOr[
        (js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]) | (js.Array[
          NonNullable[
            js.UndefOr[js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]]
          ]
        ])
      ] = js.undefined
    
    var onWorkerEnd: js.UndefOr[
        (js.Function4[
          /* cid */ String, 
          /* exitCode */ Double, 
          /* specs */ js.Array[String], 
          /* retries */ Double, 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function4[
                /* cid */ String, 
                /* exitCode */ Double, 
                /* specs */ js.Array[String], 
                /* retries */ Double, 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var onWorkerStart: js.UndefOr[
        (js.Function5[
          /* cid */ String, 
          /* caps */ DesiredCapabilities, 
          /* specs */ js.Array[String], 
          /* args */ this.type, 
          /* execArgv */ js.Array[String], 
          Unit
        ]) | (js.Array[
          NonNullable[
            js.UndefOr[
              js.Function5[
                /* cid */ String, 
                /* caps */ DesiredCapabilities, 
                /* specs */ js.Array[String], 
                /* args */ this.type, 
                /* execArgv */ js.Array[String], 
                Unit
              ]
            ]
          ]
        ])
      ] = js.undefined
    
    var outputDir: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var queryParams: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var region: js.UndefOr[SauceRegions] = js.undefined
    
    var reporterSyncInterval: js.UndefOr[Double] = js.undefined
    
    var reporterSyncTimeout: js.UndefOr[Double] = js.undefined
    
    var reporters: js.UndefOr[js.Array[ReporterEntry]] = js.undefined
    
    var runner: js.UndefOr[local] = js.undefined
    
    var runnerEnv: js.UndefOr[Record[String, Any]] = js.undefined
    
    var services: js.UndefOr[js.Array[ServiceEntry]] = js.undefined
    
    var spec: js.UndefOr[js.Array[String]] = js.undefined
    
    var specFileRetries: js.UndefOr[Double] = js.undefined
    
    var specFileRetriesDeferred: js.UndefOr[Boolean] = js.undefined
    
    var specFileRetriesDelay: js.UndefOr[Double] = js.undefined
    
    var specs: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
    
    var strictSSL: js.UndefOr[Boolean] = js.undefined
    
    var suite: js.UndefOr[js.Array[String]] = js.undefined
    
    var suites: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
    
    var transformRequest: js.UndefOr[js.Function1[/* requestOptions */ RequestLibOptions, RequestLibOptions]] = js.undefined
    
    var transformResponse: js.UndefOr[
        js.Function2[
          /* response */ RequestLibResponse, 
          /* requestOptions */ RequestLibOptions, 
          RequestLibResponse
        ]
      ] = js.undefined
    
    var user: js.UndefOr[String] = js.undefined
    
    var waitforInterval: js.UndefOr[Double] = js.undefined
    
    var waitforTimeout: js.UndefOr[Double] = js.undefined
    
    var watch: js.UndefOr[Boolean] = js.undefined
  }
  object TestrunnerOptionsWithParameters {
    
    inline def apply(): TestrunnerOptionsWithParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TestrunnerOptionsWithParameters]
    }
    
    extension [Self <: TestrunnerOptionsWithParameters](x: Self) {
      
      inline def setAfter(
        value: (js.Function3[
              /* result */ Double, 
              /* capabilities */ RemoteCapability, 
              /* specs */ js.Array[String], 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function3[
                    /* result */ Double, 
                    /* capabilities */ RemoteCapability, 
                    /* specs */ js.Array[String], 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterCommand(
        value: (js.Function4[
              /* commandName */ String, 
              /* args */ js.Array[Any], 
              /* result */ Any, 
              /* error */ js.UndefOr[js.Error], 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function4[
                    /* commandName */ String, 
                    /* args */ js.Array[Any], 
                    /* result */ Any, 
                    /* error */ js.UndefOr[js.Error], 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "afterCommand", value.asInstanceOf[js.Any])
      
      inline def setAfterCommandFunction4(
        value: (/* commandName */ String, /* args */ js.Array[Any], /* result */ Any, /* error */ js.UndefOr[js.Error]) => Callback
      ): Self = StObject.set(x, "afterCommand", js.Any.fromFunction4((t0: /* commandName */ String, t1: /* args */ js.Array[Any], t2: /* result */ Any, t3: /* error */ js.UndefOr[js.Error]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setAfterCommandUndefined: Self = StObject.set(x, "afterCommand", js.undefined)
      
      inline def setAfterCommandVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function4[
                  /* commandName */ String, 
                  /* args */ js.Array[Any], 
                  /* result */ Any, 
                  /* error */ js.UndefOr[js.Error], 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "afterCommand", js.Array(value*))
      
      inline def setAfterFunction3(
        value: (/* result */ Double, /* capabilities */ RemoteCapability, /* specs */ js.Array[String]) => Callback
      ): Self = StObject.set(x, "after", js.Any.fromFunction3((t0: /* result */ Double, t1: /* capabilities */ RemoteCapability, t2: /* specs */ js.Array[String]) => (value(t0, t1, t2)).runNow()))
      
      inline def setAfterHook(
        value: (js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]) | (js.Array[
              NonNullable[
                js.UndefOr[js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]]
              ]
            ])
      ): Self = StObject.set(x, "afterHook", value.asInstanceOf[js.Any])
      
      inline def setAfterHookFunction3(value: (/* test */ Test, /* context */ Any, /* result */ TestResult) => Callback): Self = StObject.set(x, "afterHook", js.Any.fromFunction3((t0: /* test */ Test, t1: /* context */ Any, t2: /* result */ TestResult) => (value(t0, t1, t2)).runNow()))
      
      inline def setAfterHookUndefined: Self = StObject.set(x, "afterHook", js.undefined)
      
      inline def setAfterHookVarargs(
        value: (NonNullable[
              js.UndefOr[js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]]
            ])*
      ): Self = StObject.set(x, "afterHook", js.Array(value*))
      
      inline def setAfterSession(
        value: (js.Function3[
              TestrunnerOptionsWithParameters, 
              /* capabilities */ RemoteCapability, 
              /* specs */ js.Array[String], 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function3[
                    TestrunnerOptionsWithParameters, 
                    /* capabilities */ RemoteCapability, 
                    /* specs */ js.Array[String], 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "afterSession", value.asInstanceOf[js.Any])
      
      inline def setAfterSessionFunction3(
        value: (TestrunnerOptionsWithParameters, /* capabilities */ RemoteCapability, /* specs */ js.Array[String]) => Callback
      ): Self = StObject.set(x, "afterSession", js.Any.fromFunction3((t0: TestrunnerOptionsWithParameters, t1: /* capabilities */ RemoteCapability, t2: /* specs */ js.Array[String]) => (value(t0, t1, t2)).runNow()))
      
      inline def setAfterSessionUndefined: Self = StObject.set(x, "afterSession", js.undefined)
      
      inline def setAfterSessionVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function3[
                  TestrunnerOptionsWithParameters, 
                  /* capabilities */ RemoteCapability, 
                  /* specs */ js.Array[String], 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "afterSession", js.Array(value*))
      
      inline def setAfterSuite(
        value: (js.Function1[/* suite */ Suite, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function1[/* suite */ Suite, Unit]]]])
      ): Self = StObject.set(x, "afterSuite", value.asInstanceOf[js.Any])
      
      inline def setAfterSuiteFunction1(value: /* suite */ Suite => Callback): Self = StObject.set(x, "afterSuite", js.Any.fromFunction1((t0: /* suite */ Suite) => value(t0).runNow()))
      
      inline def setAfterSuiteUndefined: Self = StObject.set(x, "afterSuite", js.undefined)
      
      inline def setAfterSuiteVarargs(value: (NonNullable[js.UndefOr[js.Function1[/* suite */ Suite, Unit]]])*): Self = StObject.set(x, "afterSuite", js.Array(value*))
      
      inline def setAfterTest(
        value: (js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]) | (js.Array[
              NonNullable[
                js.UndefOr[js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]]
              ]
            ])
      ): Self = StObject.set(x, "afterTest", value.asInstanceOf[js.Any])
      
      inline def setAfterTestFunction3(value: (/* test */ Test, /* context */ Any, /* result */ TestResult) => Callback): Self = StObject.set(x, "afterTest", js.Any.fromFunction3((t0: /* test */ Test, t1: /* context */ Any, t2: /* result */ TestResult) => (value(t0, t1, t2)).runNow()))
      
      inline def setAfterTestUndefined: Self = StObject.set(x, "afterTest", js.undefined)
      
      inline def setAfterTestVarargs(
        value: (NonNullable[
              js.UndefOr[js.Function3[/* test */ Test, /* context */ Any, /* result */ TestResult, Unit]]
            ])*
      ): Self = StObject.set(x, "afterTest", js.Array(value*))
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAfterVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function3[
                  /* result */ Double, 
                  /* capabilities */ RemoteCapability, 
                  /* specs */ js.Array[String], 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "after", js.Array(value*))
      
      inline def setAgent(value: Http): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAutoCompileOpts(value: AutoCompileConfig): Self = StObject.set(x, "autoCompileOpts", value.asInstanceOf[js.Any])
      
      inline def setAutoCompileOptsUndefined: Self = StObject.set(x, "autoCompileOpts", js.undefined)
      
      inline def setAutomationProtocol(value: SupportedProtocols): Self = StObject.set(x, "automationProtocol", value.asInstanceOf[js.Any])
      
      inline def setAutomationProtocolUndefined: Self = StObject.set(x, "automationProtocol", js.undefined)
      
      inline def setBail(value: Double): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
      
      inline def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setBefore(
        value: (js.Function3[
              /* capabilities */ RemoteCapability, 
              /* specs */ js.Array[String], 
              /* browser */ Any, 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function3[
                    /* capabilities */ RemoteCapability, 
                    /* specs */ js.Array[String], 
                    /* browser */ Any, 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeCommand(
        value: (js.Function2[/* commandName */ String, /* args */ js.Array[Any], Unit]) | (js.Array[
              NonNullable[
                js.UndefOr[js.Function2[/* commandName */ String, /* args */ js.Array[Any], Unit]]
              ]
            ])
      ): Self = StObject.set(x, "beforeCommand", value.asInstanceOf[js.Any])
      
      inline def setBeforeCommandFunction2(value: (/* commandName */ String, /* args */ js.Array[Any]) => Callback): Self = StObject.set(x, "beforeCommand", js.Any.fromFunction2((t0: /* commandName */ String, t1: /* args */ js.Array[Any]) => (value(t0, t1)).runNow()))
      
      inline def setBeforeCommandUndefined: Self = StObject.set(x, "beforeCommand", js.undefined)
      
      inline def setBeforeCommandVarargs(
        value: (NonNullable[
              js.UndefOr[js.Function2[/* commandName */ String, /* args */ js.Array[Any], Unit]]
            ])*
      ): Self = StObject.set(x, "beforeCommand", js.Array(value*))
      
      inline def setBeforeFunction3(
        value: (/* capabilities */ RemoteCapability, /* specs */ js.Array[String], /* browser */ Any) => Callback
      ): Self = StObject.set(x, "before", js.Any.fromFunction3((t0: /* capabilities */ RemoteCapability, t1: /* specs */ js.Array[String], t2: /* browser */ Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setBeforeHook(
        value: (js.Function2[/* test */ Any, /* context */ Any, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function2[/* test */ Any, /* context */ Any, Unit]]]])
      ): Self = StObject.set(x, "beforeHook", value.asInstanceOf[js.Any])
      
      inline def setBeforeHookFunction2(value: (/* test */ Any, /* context */ Any) => Callback): Self = StObject.set(x, "beforeHook", js.Any.fromFunction2((t0: /* test */ Any, t1: /* context */ Any) => (value(t0, t1)).runNow()))
      
      inline def setBeforeHookUndefined: Self = StObject.set(x, "beforeHook", js.undefined)
      
      inline def setBeforeHookVarargs(value: (NonNullable[js.UndefOr[js.Function2[/* test */ Any, /* context */ Any, Unit]]])*): Self = StObject.set(x, "beforeHook", js.Array(value*))
      
      inline def setBeforeSession(
        value: (js.Function4[
              /* config */ OmitTestrunnercapabilitieAfter, 
              /* capabilities */ RemoteCapability, 
              /* specs */ js.Array[String], 
              /* cid */ String, 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function4[
                    /* config */ OmitTestrunnercapabilitieAfter, 
                    /* capabilities */ RemoteCapability, 
                    /* specs */ js.Array[String], 
                    /* cid */ String, 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "beforeSession", value.asInstanceOf[js.Any])
      
      inline def setBeforeSessionFunction4(
        value: (/* config */ OmitTestrunnercapabilitieAfter, /* capabilities */ RemoteCapability, /* specs */ js.Array[String], /* cid */ String) => Callback
      ): Self = StObject.set(x, "beforeSession", js.Any.fromFunction4((t0: /* config */ OmitTestrunnercapabilitieAfter, t1: /* capabilities */ RemoteCapability, t2: /* specs */ js.Array[String], t3: /* cid */ String) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setBeforeSessionUndefined: Self = StObject.set(x, "beforeSession", js.undefined)
      
      inline def setBeforeSessionVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function4[
                  /* config */ OmitTestrunnercapabilitieAfter, 
                  /* capabilities */ RemoteCapability, 
                  /* specs */ js.Array[String], 
                  /* cid */ String, 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "beforeSession", js.Array(value*))
      
      inline def setBeforeSuite(
        value: (js.Function1[/* suite */ Suite, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function1[/* suite */ Suite, Unit]]]])
      ): Self = StObject.set(x, "beforeSuite", value.asInstanceOf[js.Any])
      
      inline def setBeforeSuiteFunction1(value: /* suite */ Suite => Callback): Self = StObject.set(x, "beforeSuite", js.Any.fromFunction1((t0: /* suite */ Suite) => value(t0).runNow()))
      
      inline def setBeforeSuiteUndefined: Self = StObject.set(x, "beforeSuite", js.undefined)
      
      inline def setBeforeSuiteVarargs(value: (NonNullable[js.UndefOr[js.Function1[/* suite */ Suite, Unit]]])*): Self = StObject.set(x, "beforeSuite", js.Array(value*))
      
      inline def setBeforeTest(
        value: (js.Function2[/* test */ Test, /* context */ Any, Unit]) | (js.Array[NonNullable[js.UndefOr[js.Function2[/* test */ Test, /* context */ Any, Unit]]]])
      ): Self = StObject.set(x, "beforeTest", value.asInstanceOf[js.Any])
      
      inline def setBeforeTestFunction2(value: (/* test */ Test, /* context */ Any) => Callback): Self = StObject.set(x, "beforeTest", js.Any.fromFunction2((t0: /* test */ Test, t1: /* context */ Any) => (value(t0, t1)).runNow()))
      
      inline def setBeforeTestUndefined: Self = StObject.set(x, "beforeTest", js.undefined)
      
      inline def setBeforeTestVarargs(value: (NonNullable[js.UndefOr[js.Function2[/* test */ Test, /* context */ Any, Unit]]])*): Self = StObject.set(x, "beforeTest", js.Array(value*))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBeforeVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function3[
                  /* capabilities */ RemoteCapability, 
                  /* specs */ js.Array[String], 
                  /* browser */ Any, 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "before", js.Array(value*))
      
      inline def setCapabilities(value: RemoteCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
      
      inline def setCapabilitiesVarargs(value: (DesiredCapabilities | W3CCapabilities)*): Self = StObject.set(x, "capabilities", js.Array(value*))
      
      inline def setConnectionRetryCount(value: Double): Self = StObject.set(x, "connectionRetryCount", value.asInstanceOf[js.Any])
      
      inline def setConnectionRetryCountUndefined: Self = StObject.set(x, "connectionRetryCount", js.undefined)
      
      inline def setConnectionRetryTimeout(value: Double): Self = StObject.set(x, "connectionRetryTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectionRetryTimeoutUndefined: Self = StObject.set(x, "connectionRetryTimeout", js.undefined)
      
      inline def setCucumberFeaturesWithLineNumbers(value: js.Array[String]): Self = StObject.set(x, "cucumberFeaturesWithLineNumbers", value.asInstanceOf[js.Any])
      
      inline def setCucumberFeaturesWithLineNumbersUndefined: Self = StObject.set(x, "cucumberFeaturesWithLineNumbers", js.undefined)
      
      inline def setCucumberFeaturesWithLineNumbersVarargs(value: String*): Self = StObject.set(x, "cucumberFeaturesWithLineNumbers", js.Array(value*))
      
      inline def setCucumberOpts(value: CucumberOpts): Self = StObject.set(x, "cucumberOpts", value.asInstanceOf[js.Any])
      
      inline def setCucumberOptsUndefined: Self = StObject.set(x, "cucumberOpts", js.undefined)
      
      inline def setEnableDirectConnect(value: Boolean): Self = StObject.set(x, "enableDirectConnect", value.asInstanceOf[js.Any])
      
      inline def setEnableDirectConnectUndefined: Self = StObject.set(x, "enableDirectConnect", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setExecArgv(value: js.Array[String]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
      
      inline def setExecArgvUndefined: Self = StObject.set(x, "execArgv", js.undefined)
      
      inline def setExecArgvVarargs(value: String*): Self = StObject.set(x, "execArgv", js.Array(value*))
      
      inline def setFilesToWatch(value: js.Array[String]): Self = StObject.set(x, "filesToWatch", value.asInstanceOf[js.Any])
      
      inline def setFilesToWatchUndefined: Self = StObject.set(x, "filesToWatch", js.undefined)
      
      inline def setFilesToWatchVarargs(value: String*): Self = StObject.set(x, "filesToWatch", js.Array(value*))
      
      inline def setFramework(value: String): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
      
      inline def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setJasmineOpts(value: JasmineOpts): Self = StObject.set(x, "jasmineOpts", value.asInstanceOf[js.Any])
      
      inline def setJasmineOptsUndefined: Self = StObject.set(x, "jasmineOpts", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLogLevel(value: WebDriverLogTypes): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setLogLevels(value: Record[String, WebDriverLogTypes]): Self = StObject.set(x, "logLevels", value.asInstanceOf[js.Any])
      
      inline def setLogLevelsUndefined: Self = StObject.set(x, "logLevels", js.undefined)
      
      inline def setMaxInstances(value: Double): Self = StObject.set(x, "maxInstances", value.asInstanceOf[js.Any])
      
      inline def setMaxInstancesPerCapability(value: Double): Self = StObject.set(x, "maxInstancesPerCapability", value.asInstanceOf[js.Any])
      
      inline def setMaxInstancesPerCapabilityUndefined: Self = StObject.set(x, "maxInstancesPerCapability", js.undefined)
      
      inline def setMaxInstancesUndefined: Self = StObject.set(x, "maxInstances", js.undefined)
      
      inline def setMochaOpts(value: MochaOpts): Self = StObject.set(x, "mochaOpts", value.asInstanceOf[js.Any])
      
      inline def setMochaOptsUndefined: Self = StObject.set(x, "mochaOpts", js.undefined)
      
      inline def setOnComplete(
        value: (js.Function4[
              /* exitCode */ Double, 
              /* config */ OmitTestrunnercapabilitieAfter, 
              /* capabilities */ RemoteCapabilities, 
              /* results */ Any, 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function4[
                    /* exitCode */ Double, 
                    /* config */ OmitTestrunnercapabilitieAfter, 
                    /* capabilities */ RemoteCapabilities, 
                    /* results */ Any, 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
      
      inline def setOnCompleteFunction4(
        value: (/* exitCode */ Double, /* config */ OmitTestrunnercapabilitieAfter, /* capabilities */ RemoteCapabilities, /* results */ Any) => Callback
      ): Self = StObject.set(x, "onComplete", js.Any.fromFunction4((t0: /* exitCode */ Double, t1: /* config */ OmitTestrunnercapabilitieAfter, t2: /* capabilities */ RemoteCapabilities, t3: /* results */ Any) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnCompleteVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function4[
                  /* exitCode */ Double, 
                  /* config */ OmitTestrunnercapabilitieAfter, 
                  /* capabilities */ RemoteCapabilities, 
                  /* results */ Any, 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "onComplete", js.Array(value*))
      
      inline def setOnPrepare(
        value: (js.Function2[TestrunnerOptionsWithParameters, /* capabilities */ RemoteCapabilities, Unit]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function2[TestrunnerOptionsWithParameters, /* capabilities */ RemoteCapabilities, Unit]
                ]
              ]
            ])
      ): Self = StObject.set(x, "onPrepare", value.asInstanceOf[js.Any])
      
      inline def setOnPrepareFunction2(value: (TestrunnerOptionsWithParameters, /* capabilities */ RemoteCapabilities) => Callback): Self = StObject.set(x, "onPrepare", js.Any.fromFunction2((t0: TestrunnerOptionsWithParameters, t1: /* capabilities */ RemoteCapabilities) => (value(t0, t1)).runNow()))
      
      inline def setOnPrepareUndefined: Self = StObject.set(x, "onPrepare", js.undefined)
      
      inline def setOnPrepareVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function2[TestrunnerOptionsWithParameters, /* capabilities */ RemoteCapabilities, Unit]
              ]
            ])*
      ): Self = StObject.set(x, "onPrepare", js.Array(value*))
      
      inline def setOnReload(
        value: (js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]) | (js.Array[
              NonNullable[
                js.UndefOr[js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]]
              ]
            ])
      ): Self = StObject.set(x, "onReload", value.asInstanceOf[js.Any])
      
      inline def setOnReloadFunction2(value: (/* oldSessionId */ String, /* newSessionId */ String) => Callback): Self = StObject.set(x, "onReload", js.Any.fromFunction2((t0: /* oldSessionId */ String, t1: /* newSessionId */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnReloadUndefined: Self = StObject.set(x, "onReload", js.undefined)
      
      inline def setOnReloadVarargs(
        value: (NonNullable[
              js.UndefOr[js.Function2[/* oldSessionId */ String, /* newSessionId */ String, Unit]]
            ])*
      ): Self = StObject.set(x, "onReload", js.Array(value*))
      
      inline def setOnWorkerEnd(
        value: (js.Function4[
              /* cid */ String, 
              /* exitCode */ Double, 
              /* specs */ js.Array[String], 
              /* retries */ Double, 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function4[
                    /* cid */ String, 
                    /* exitCode */ Double, 
                    /* specs */ js.Array[String], 
                    /* retries */ Double, 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "onWorkerEnd", value.asInstanceOf[js.Any])
      
      inline def setOnWorkerEndFunction4(
        value: (/* cid */ String, /* exitCode */ Double, /* specs */ js.Array[String], /* retries */ Double) => Callback
      ): Self = StObject.set(x, "onWorkerEnd", js.Any.fromFunction4((t0: /* cid */ String, t1: /* exitCode */ Double, t2: /* specs */ js.Array[String], t3: /* retries */ Double) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnWorkerEndUndefined: Self = StObject.set(x, "onWorkerEnd", js.undefined)
      
      inline def setOnWorkerEndVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function4[
                  /* cid */ String, 
                  /* exitCode */ Double, 
                  /* specs */ js.Array[String], 
                  /* retries */ Double, 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "onWorkerEnd", js.Array(value*))
      
      inline def setOnWorkerStart(
        value: (js.Function5[
              /* cid */ String, 
              /* caps */ DesiredCapabilities, 
              /* specs */ js.Array[String], 
              TestrunnerOptionsWithParameters, 
              /* execArgv */ js.Array[String], 
              Unit
            ]) | (js.Array[
              NonNullable[
                js.UndefOr[
                  js.Function5[
                    /* cid */ String, 
                    /* caps */ DesiredCapabilities, 
                    /* specs */ js.Array[String], 
                    TestrunnerOptionsWithParameters, 
                    /* execArgv */ js.Array[String], 
                    Unit
                  ]
                ]
              ]
            ])
      ): Self = StObject.set(x, "onWorkerStart", value.asInstanceOf[js.Any])
      
      inline def setOnWorkerStartFunction5(
        value: (/* cid */ String, /* caps */ DesiredCapabilities, /* specs */ js.Array[String], TestrunnerOptionsWithParameters, /* execArgv */ js.Array[String]) => Callback
      ): Self = StObject.set(x, "onWorkerStart", js.Any.fromFunction5((t0: /* cid */ String, t1: /* caps */ DesiredCapabilities, t2: /* specs */ js.Array[String], t3: TestrunnerOptionsWithParameters, t4: /* execArgv */ js.Array[String]) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setOnWorkerStartUndefined: Self = StObject.set(x, "onWorkerStart", js.undefined)
      
      inline def setOnWorkerStartVarargs(
        value: (NonNullable[
              js.UndefOr[
                js.Function5[
                  /* cid */ String, 
                  /* caps */ DesiredCapabilities, 
                  /* specs */ js.Array[String], 
                  TestrunnerOptionsWithParameters, 
                  /* execArgv */ js.Array[String], 
                  Unit
                ]
              ]
            ])*
      ): Self = StObject.set(x, "onWorkerStart", js.Array(value*))
      
      inline def setOutputDir(value: String): Self = StObject.set(x, "outputDir", value.asInstanceOf[js.Any])
      
      inline def setOutputDirUndefined: Self = StObject.set(x, "outputDir", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setQueryParams(value: StringDictionary[String]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      inline def setRegion(value: SauceRegions): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setReporterSyncInterval(value: Double): Self = StObject.set(x, "reporterSyncInterval", value.asInstanceOf[js.Any])
      
      inline def setReporterSyncIntervalUndefined: Self = StObject.set(x, "reporterSyncInterval", js.undefined)
      
      inline def setReporterSyncTimeout(value: Double): Self = StObject.set(x, "reporterSyncTimeout", value.asInstanceOf[js.Any])
      
      inline def setReporterSyncTimeoutUndefined: Self = StObject.set(x, "reporterSyncTimeout", js.undefined)
      
      inline def setReporters(value: js.Array[ReporterEntry]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      inline def setReportersVarargs(value: ReporterEntry*): Self = StObject.set(x, "reporters", js.Array(value*))
      
      inline def setRunner(value: local): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
      
      inline def setRunnerEnv(value: Record[String, Any]): Self = StObject.set(x, "runnerEnv", value.asInstanceOf[js.Any])
      
      inline def setRunnerEnvUndefined: Self = StObject.set(x, "runnerEnv", js.undefined)
      
      inline def setRunnerUndefined: Self = StObject.set(x, "runner", js.undefined)
      
      inline def setServices(value: js.Array[ServiceEntry]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
      
      inline def setServicesVarargs(value: ServiceEntry*): Self = StObject.set(x, "services", js.Array(value*))
      
      inline def setSpec(value: js.Array[String]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecFileRetries(value: Double): Self = StObject.set(x, "specFileRetries", value.asInstanceOf[js.Any])
      
      inline def setSpecFileRetriesDeferred(value: Boolean): Self = StObject.set(x, "specFileRetriesDeferred", value.asInstanceOf[js.Any])
      
      inline def setSpecFileRetriesDeferredUndefined: Self = StObject.set(x, "specFileRetriesDeferred", js.undefined)
      
      inline def setSpecFileRetriesDelay(value: Double): Self = StObject.set(x, "specFileRetriesDelay", value.asInstanceOf[js.Any])
      
      inline def setSpecFileRetriesDelayUndefined: Self = StObject.set(x, "specFileRetriesDelay", js.undefined)
      
      inline def setSpecFileRetriesUndefined: Self = StObject.set(x, "specFileRetries", js.undefined)
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      inline def setSpecVarargs(value: String*): Self = StObject.set(x, "spec", js.Array(value*))
      
      inline def setSpecs(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
      
      inline def setSpecsUndefined: Self = StObject.set(x, "specs", js.undefined)
      
      inline def setSpecsVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "specs", js.Array(value*))
      
      inline def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
      
      inline def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
      
      inline def setSuite(value: js.Array[String]): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
      
      inline def setSuiteUndefined: Self = StObject.set(x, "suite", js.undefined)
      
      inline def setSuiteVarargs(value: String*): Self = StObject.set(x, "suite", js.Array(value*))
      
      inline def setSuites(value: Record[String, js.Array[String]]): Self = StObject.set(x, "suites", value.asInstanceOf[js.Any])
      
      inline def setSuitesUndefined: Self = StObject.set(x, "suites", js.undefined)
      
      inline def setTransformRequest(value: /* requestOptions */ RequestLibOptions => RequestLibOptions): Self = StObject.set(x, "transformRequest", js.Any.fromFunction1(value))
      
      inline def setTransformRequestUndefined: Self = StObject.set(x, "transformRequest", js.undefined)
      
      inline def setTransformResponse(
        value: (/* response */ RequestLibResponse, /* requestOptions */ RequestLibOptions) => RequestLibResponse
      ): Self = StObject.set(x, "transformResponse", js.Any.fromFunction2(value))
      
      inline def setTransformResponseUndefined: Self = StObject.set(x, "transformResponse", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      
      inline def setWaitforInterval(value: Double): Self = StObject.set(x, "waitforInterval", value.asInstanceOf[js.Any])
      
      inline def setWaitforIntervalUndefined: Self = StObject.set(x, "waitforInterval", js.undefined)
      
      inline def setWaitforTimeout(value: Double): Self = StObject.set(x, "waitforTimeout", value.asInstanceOf[js.Any])
      
      inline def setWaitforTimeoutUndefined: Self = StObject.set(x, "waitforTimeout", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
}
