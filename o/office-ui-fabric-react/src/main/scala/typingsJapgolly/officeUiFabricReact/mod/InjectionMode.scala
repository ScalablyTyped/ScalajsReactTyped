package typingsJapgolly.officeUiFabricReact.mod

import typingsJapgolly.officeUiFabricReact.officeUiFabricReactInts.`0`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactInts.`1`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InjectionMode {
  
  @JSImport("office-ui-fabric-react", "InjectionMode")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Appends rules using appendChild.
    */
  @JSImport("office-ui-fabric-react", "InjectionMode.appendChild")
  @js.native
  def appendChild: `2` = js.native
  inline def appendChild_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appendChild")(x.asInstanceOf[js.Any])
  
  /**
    * Inserts rules using the insertRule api.
    */
  @JSImport("office-ui-fabric-react", "InjectionMode.insertNode")
  @js.native
  def insertNode: `1` = js.native
  inline def insertNode_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("insertNode")(x.asInstanceOf[js.Any])
  
  /**
    * Avoids style injection, use getRules() to read the styles.
    */
  @JSImport("office-ui-fabric-react", "InjectionMode.none")
  @js.native
  def none: `0` = js.native
  inline def none_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
}
