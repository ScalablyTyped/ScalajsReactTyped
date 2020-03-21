package typingsJapgolly.yogRal

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.nodeRal.mod.BalanceContextConstructor
import typingsJapgolly.nodeRal.mod.LoggerFactory
import typingsJapgolly.nodeRal.mod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yog-ral", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  abstract class Balance ()
    extends typingsJapgolly.nodeRal.mod.Balance
  
  @js.native
  abstract class ConfigNormalizer ()
    extends typingsJapgolly.nodeRal.mod.ConfigNormalizer
  
  @js.native
  abstract class Converter ()
    extends typingsJapgolly.nodeRal.mod.Converter
  
  @js.native
  abstract class Protocol ()
    extends typingsJapgolly.nodeRal.mod.Protocol
  
  @js.native
  abstract class RalModule ()
    extends typingsJapgolly.nodeRal.mod.RalModule
  
  val Config: typingsJapgolly.nodeRal.mod.Config = js.native
  val Logger: LoggerFactory = js.native
  def Middleware(): js.Function3[
    /* req */ Request_[ParamsDictionary], 
    /* resp */ Response_, 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  def Middleware(options: Service): js.Function3[
    /* req */ Request_[ParamsDictionary], 
    /* resp */ Response_, 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  /* static members */
  @js.native
  object Balance extends js.Object {
    @js.native
    class BalanceContextClass protected ()
      extends typingsJapgolly.nodeRal.mod.Balance.BalanceContextClass {
      def this(serviceID: String, service: Service) = this()
    }
    
    var BalanceContext: BalanceContextConstructor = js.native
  }
  
  /* static members */
  @js.native
  object Protocol extends js.Object {
    def beforeRequest(context: js.Any): js.Any = js.native
    def normalizeConfig(context: js.Any): js.Any = js.native
  }
  
  @js.native
  object RAL extends js.Object {
    @js.native
    class NormalizerManager ()
      extends typingsJapgolly.nodeRal.mod.RAL.NormalizerManager
    
    @js.native
    class RalRunner protected ()
      extends typingsJapgolly.nodeRal.mod.RAL.RalRunner {
      def this(serviceName: String) = this()
      def this(serviceName: String, options: js.Object) = this()
    }
    
    def apply(serviceName: String): typingsJapgolly.nodeRal.mod.RAL.RalRunner = js.native
    def apply(serviceName: String, options: js.Object): typingsJapgolly.nodeRal.mod.RAL.RalRunner = js.native
    def appendExtPath(extPath: String): Unit = js.native
    def getConf(name: String): typingsJapgolly.nodeRal.mod.Config = js.native
    def getRawConf(name: String): typingsJapgolly.nodeRal.mod.Config = js.native
    def init(): Unit = js.native
    def init(options: js.Object): Unit = js.native
    def reload(): Unit = js.native
    def reload(options: js.Object): Unit = js.native
    def setConfigNormalizer(normalizers: typingsJapgolly.nodeRal.mod.ConfigNormalizer): Unit = js.native
  }
  
  @js.native
  object RALPromise extends js.Object {
    def apply[T](name: String): js.Promise[T] = js.native
    def apply[T](name: String, options: js.Object): js.Promise[T] = js.native
  }
  
  /* static members */
  @js.native
  object RalModule extends js.Object {
    var modules: StringDictionary[typingsJapgolly.nodeRal.mod.RalModule] = js.native
    def clearCache(): Unit = js.native
    def load(pathOrModule: String): Unit = js.native
    def load(pathOrModule: typingsJapgolly.nodeRal.mod.RalModule): Unit = js.native
  }
  
}

