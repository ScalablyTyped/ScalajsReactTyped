package typingsJapgolly.styletronReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CSSFn = js.Function1[/* style */ typingsJapgolly.styletronStandard.mod.StyleObject, java.lang.String]
  type Reducer = js.Function2[
    /* style */ typingsJapgolly.styletronStandard.mod.StyleObject, 
    /* props */ js.UndefOr[js.Object], 
    typingsJapgolly.styletronStandard.mod.StyleObject
  ]
  type StackIndex = scala.Double
  type StyleObjectFn[P /* <: js.Object */] = js.Function1[/* props */ P, typingsJapgolly.styletronStandard.mod.StyleObject]
  type StyleProp[P /* <: js.Object */] = typingsJapgolly.styletronStandard.mod.StyleObject | typingsJapgolly.styletronReact.mod.StyleObjectFn[P]
  type StyletronBase = japgolly.scalajs.react.raw.React.ElementType
  type StyletronDriver = js.Function2[
    /* style */ typingsJapgolly.styletronStandard.mod.StyleObject, 
    /* styletron */ typingsJapgolly.styletronStandard.mod.StandardEngine, 
    java.lang.String
  ]
  type StyletronGetInitialStyle = js.Function0[typingsJapgolly.styletronStandard.mod.StyleObject]
  type StyletronWrapper = js.Function1[
    /* fc */ typingsJapgolly.react.mod.FC[js.Any], 
    typingsJapgolly.react.mod.ComponentType[js.Any]
  ]
  type WithTransformFn = js.Function2[
    /* component */ typingsJapgolly.styletronReact.mod.StyletronComponent[js.Any], 
    /* style */ js.Function2[
      /* style */ typingsJapgolly.styletronStandard.mod.StyleObject, 
      /* props */ js.Object, 
      typingsJapgolly.styletronStandard.mod.StyleObject
    ], 
    typingsJapgolly.styletronReact.mod.StyletronComponent[
      typingsJapgolly.react.mod.ComponentProps[typingsJapgolly.styletronReact.mod.StyletronComponent[_]] with js.Object
    ]
  ]
  type WithWrapperFn = js.Function2[
    /* component */ typingsJapgolly.styletronReact.mod.StyletronComponent[js.Any], 
    /* wrapper */ js.Function1[
      /* component */ typingsJapgolly.styletronReact.mod.StyletronComponent[js.Any], 
      typingsJapgolly.react.mod.ComponentType[js.Object]
    ], 
    typingsJapgolly.styletronReact.mod.StyletronComponent[
      typingsJapgolly.react.mod.ComponentProps[typingsJapgolly.styletronReact.mod.StyletronComponent[_]] with js.Object
    ]
  ]
}
