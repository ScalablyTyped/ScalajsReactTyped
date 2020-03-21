package typingsJapgolly.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ObjC {
  type BlockMethodImplementation = js.ThisFunction1[/* this */ typingsJapgolly.fridaGum.ObjC.Block, /* repeated */ js.Any, js.Any]
  type ChooseSpecifier = typingsJapgolly.fridaGum.ObjC.SimpleChooseSpecifier | typingsJapgolly.fridaGum.ObjC.DetailedChooseSpecifier
  type EnumerateLoadedClassesResult = /**
    * Class names grouped by name of owner module.
    */
  org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  /**
    * User-defined data that can be accessed from method implementations.
    */
  type InstanceData = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ObjectMethods = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.fridaGum.ObjC.ObjectMethod]
  type ProtocolPropertyAttributes = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type SimpleChooseSpecifier = typingsJapgolly.fridaGum.ObjC.Object
  type UserMethodImplementation[D, T, S] = js.ThisFunction1[
    /* this */ typingsJapgolly.fridaGum.ObjC.UserMethodInvocation[D, T, S], 
    /* repeated */ js.Any, 
    js.Any
  ]
}
