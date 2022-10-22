package typingsJapgolly.reactWindow.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.Key
import typingsJapgolly.reactWindow.anon.ColumnIndex
import typingsJapgolly.reactWindow.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def areEqual(prevProps: js.Object, nextProps: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areEqual")(prevProps.asInstanceOf[js.Any], nextProps.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def shouldComponentUpdate[P, S](nextProps: P, nextState: S): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldComponentUpdate")(nextProps.asInstanceOf[js.Any], nextState.asInstanceOf[js.Any])).asInstanceOf[Boolean]

type GridItemKeySelector[T] = js.Function1[/* params */ ColumnIndex[T], Key]

type ListItemKeySelector[T] = js.Function2[/* index */ Double, /* data */ T, Key]

type ReactElementType = FunctionComponent[Any] | (ComponentClassP[Any & js.Object]) | String
