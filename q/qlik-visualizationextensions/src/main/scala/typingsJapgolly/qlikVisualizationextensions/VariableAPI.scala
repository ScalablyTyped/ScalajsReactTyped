package typingsJapgolly.qlikVisualizationextensions

import typingsJapgolly.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VariableAPI {
  
  @js.native
  trait IVariable extends StObject {
    
    /**
      * Creates a variable.
      * @param qProp - Variable name or properties. Properties:
      * Name | Type | Description
      * qInfo.qId | String | Optional. Variable id. If the selected ID is already in use, a new ID is automatically set by the engine.
      * qName | String | Variable name. The name must be unique.
      * qComment | String | Optional. Comment related to the variable.
      * qDefinition | String | Optional. Variable definition.
      * qNumberPresentation | Object | Optional. Defines the format of the value.
      * qIncludeInBookmark | Boolean | Optional. Set to true to update the variable when applying a bookmark. The variable value will be persisted in the bookmark.
      * @return - Returns a promise of a variable model.
      */
    def create(qProp: String): IPromise[Any] = js.native
    def create(qProp: Any): IPromise[Any] = js.native
    
    /**
      * Creates a session variable, that is a temporary variable which is not
      * persisted and needs to be recreated for each new session.
      * @param qProp - Variable properties:
      * Name | Type | Description
      * qInfo.qId | String | Optional. Variable id.
      * qName | String | Variable name.
      * qComment | String | Optional. Comment.
      * qDefinition | String | Optional. Variable definition.
      * qNumberPresentation | Object | Optional.
      * qIncludeInBookmark | Boolean | Optional. Include in bookmark flag.
      * @return - A promise of a variable model.
      */
    def createSessionVariable(qProp: Any): IPromise[Any] = js.native
    
    /**
      * Gets a variable by id.
      * @param qId - Variable id.
      * @return - A promise of a variable model.
      */
    def get(qId: String): IPromise[Any] = js.native
    
    /**
      * Gets a variable by name.
      * @param qName - Variable name.
      * @return - A promise of a variable model.
      */
    def getByName(qName: String): IPromise[Any] = js.native
    
    /**
      * Gets variable content.
      * @param name - Variable name.
      * @param callback - Callback to receive the content.
      * @return - A promise of a Qlik engine reply.
      */
    def getContent(name: String, callback: Any): IPromise[Any] = js.native
    
    /**
      * Sets the content of a variable.
      * @param name - Variable name.
      * @param content - Variable content.
      * @return - A promise of a Qlik engine reply.
      */
    def setContent(name: String, content: String): IPromise[Any] = js.native
    
    /**
      * Sets a numeric value as a variable.
      * @param qName - Variable name.
      * @param qVal - Variable value.
      * @return - A promise of a Qlik engine reply.
      */
    def setNumValue(qName: String, qVal: Double): IPromise[Any] = js.native
    
    /**
      * Sets variable string value.
      * @param qName - Variable name.
      * @param qVal - Variable value.
      * @return - A promise of a Qlik engine reply.
      */
    def setStringValue(qName: String, qVal: String): IPromise[Any] = js.native
  }
}
