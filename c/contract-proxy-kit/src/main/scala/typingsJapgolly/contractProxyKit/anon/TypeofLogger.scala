package typingsJapgolly.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.ethers.mod.ethers.utils.Logger
import typingsJapgolly.ethersprojectLogger.mod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofLogger
  extends StObject
     with Instantiable1[/* version */ String, Logger] {
  
  var errors: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ErrorCode */ Any = js.native
  
  def from(version: String): typingsJapgolly.ethersprojectLogger.mod.Logger = js.native
  
  def globalLogger(): typingsJapgolly.ethersprojectLogger.mod.Logger = js.native
  
  var levels: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel */ Any = js.native
  
  def setCensorship(censorship: Boolean): Unit = js.native
  def setCensorship(censorship: Boolean, permanent: Boolean): Unit = js.native
  
  def setLogLevel(logLevel: LogLevel): Unit = js.native
}
