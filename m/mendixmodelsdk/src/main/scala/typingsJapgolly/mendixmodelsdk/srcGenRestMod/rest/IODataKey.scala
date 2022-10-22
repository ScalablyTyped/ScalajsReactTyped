package typingsJapgolly.mendixmodelsdk.srcGenRestMod.rest

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 8.9.0: introduced
  */
@js.native
trait IODataKey
  extends StObject
     with IElement {
  
  val containerAsODataRemoteEntitySource: IODataRemoteEntitySource = js.native
  
  @JSName("model")
  val model_IODataKey: IModel = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  val parts: IList[IODataKeyPart] = js.native
}
