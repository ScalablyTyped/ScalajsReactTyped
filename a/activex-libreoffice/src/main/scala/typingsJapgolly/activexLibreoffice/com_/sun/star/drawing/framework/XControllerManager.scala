package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.framework

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link XControllerManager} gives access to the controllers of the drawing framework.
  *
  * The {@link XControllerManager} interface is typically implemented by the same object that implements {@link com.sun.star.frame.XController} .
  */
trait XControllerManager extends StObject {
  
  /**
    * Return the {@link XConfigurationController} object.
    * @returns The returned reference is never empty.
    */
  val ConfigurationController: XConfigurationController
  
  /**
    * Return the {@link XModuleController} object.
    * @returns The returned reference is never empty.
    */
  val ModuleController: XModuleController
  
  /**
    * Return the {@link XConfigurationController} object.
    * @returns The returned reference is never empty.
    */
  def getConfigurationController(): XConfigurationController
  
  /**
    * Return the {@link XModuleController} object.
    * @returns The returned reference is never empty.
    */
  def getModuleController(): XModuleController
}
object XControllerManager {
  
  inline def apply(
    ConfigurationController: XConfigurationController,
    ModuleController: XModuleController,
    getConfigurationController: CallbackTo[XConfigurationController],
    getModuleController: CallbackTo[XModuleController]
  ): XControllerManager = {
    val __obj = js.Dynamic.literal(ConfigurationController = ConfigurationController.asInstanceOf[js.Any], ModuleController = ModuleController.asInstanceOf[js.Any], getConfigurationController = getConfigurationController.toJsFn, getModuleController = getModuleController.toJsFn)
    __obj.asInstanceOf[XControllerManager]
  }
  
  extension [Self <: XControllerManager](x: Self) {
    
    inline def setConfigurationController(value: XConfigurationController): Self = StObject.set(x, "ConfigurationController", value.asInstanceOf[js.Any])
    
    inline def setGetConfigurationController(value: CallbackTo[XConfigurationController]): Self = StObject.set(x, "getConfigurationController", value.toJsFn)
    
    inline def setGetModuleController(value: CallbackTo[XModuleController]): Self = StObject.set(x, "getModuleController", value.toJsFn)
    
    inline def setModuleController(value: XModuleController): Self = StObject.set(x, "ModuleController", value.asInstanceOf[js.Any])
  }
}
