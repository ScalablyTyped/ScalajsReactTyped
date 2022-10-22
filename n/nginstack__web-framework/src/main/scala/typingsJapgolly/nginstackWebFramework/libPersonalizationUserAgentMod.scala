package typingsJapgolly.nginstackWebFramework

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPersonalizationUserAgentMod {
  
  inline def apply(browserUserAgent: String): Unit = ^.asInstanceOf[js.Dynamic].apply(browserUserAgent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/personalization/UserAgent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with UserAgent {
    def this(browserUserAgent: String) = this()
    
    /* CompleteClass */
    var browserUserAgent: String = js.native
    
    /* CompleteClass */
    override def getFrameworkUserAgent(): Double = js.native
  }
  @JSImport("@nginstack/web-framework/lib/personalization/UserAgent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait UserAgent extends StObject {
    
    var browserUserAgent: String
    
    def getFrameworkUserAgent(): Double
  }
  object UserAgent {
    
    inline def apply(browserUserAgent: String, getFrameworkUserAgent: CallbackTo[Double]): UserAgent = {
      val __obj = js.Dynamic.literal(browserUserAgent = browserUserAgent.asInstanceOf[js.Any], getFrameworkUserAgent = getFrameworkUserAgent.toJsFn)
      __obj.asInstanceOf[UserAgent]
    }
    
    extension [Self <: UserAgent](x: Self) {
      
      inline def setBrowserUserAgent(value: String): Self = StObject.set(x, "browserUserAgent", value.asInstanceOf[js.Any])
      
      inline def setGetFrameworkUserAgent(value: CallbackTo[Double]): Self = StObject.set(x, "getFrameworkUserAgent", value.toJsFn)
    }
  }
}
