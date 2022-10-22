package typingsJapgolly.grunt.grunt

import typingsJapgolly.grunt.grunt.config.ConfigModule
import typingsJapgolly.grunt.grunt.config.IProjectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * Grunt module mixins.
  */
@js.native
trait IConfigComponents
  extends StObject
     with ConfigModule {
  
  /**
    * An alias
    * @see grunt.config.ConfigModule.init
    */
  def initConfig(config: IProjectConfig): Unit = js.native
}
