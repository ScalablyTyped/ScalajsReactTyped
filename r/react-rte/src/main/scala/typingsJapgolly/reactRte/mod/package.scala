package typingsJapgolly.reactRte

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BlockRenderer = js.Function1[/* block */ typingsJapgolly.draftJs.mod.ContentBlock, java.lang.String]
  type BlockStyleFn = js.Function1[
    /* block */ typingsJapgolly.draftJs.mod.ContentBlock, 
    typingsJapgolly.reactRte.mod.RenderConfig
  ]
  type ChangeHandler = js.Function1[/* value */ typingsJapgolly.reactRte.mod.EditorValue, js.Any]
  type CustControlFunc = js.Function3[
    /* set */ typingsJapgolly.reactRte.mod.SetControlState, 
    /* get */ typingsJapgolly.reactRte.mod.GetControlState, 
    /* state */ typingsJapgolly.draftJs.mod.EditorState, 
    japgolly.scalajs.react.raw.React.Node
  ]
  type CustomBlockFn = js.Function1[
    /* element */ org.scalajs.dom.raw.Element, 
    js.UndefOr[scala.Null | typingsJapgolly.reactRte.mod.CustomBlockObject]
  ]
  type CustomControl = japgolly.scalajs.react.raw.React.Node | typingsJapgolly.reactRte.mod.CustControlFunc
  type CustomInlineFn = js.Function2[
    /* element */ org.scalajs.dom.raw.Element, 
    /* inlineCreators */ typingsJapgolly.reactRte.mod.InlineCreators, 
    js.UndefOr[
      scala.Null | typingsJapgolly.reactRte.mod.Style | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ js.Any)
    ]
  ]
  type EntityStyleFn = js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify draftjs.EntityInstance */ /* entity */ js.Any, 
    typingsJapgolly.reactRte.mod.RenderConfig
  ]
  type GetControlState = js.Function1[/* key */ java.lang.String, js.UndefOr[java.lang.String]]
  type RichTextEditor = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactRte.mod.Props with js.Object, js.Object]
  type SetControlState = js.Function2[/* key */ java.lang.String, /* value */ java.lang.String, scala.Unit]
  type StringMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type StyleConfigList = js.Array[typingsJapgolly.reactRte.mod.StyleConfig]
}
