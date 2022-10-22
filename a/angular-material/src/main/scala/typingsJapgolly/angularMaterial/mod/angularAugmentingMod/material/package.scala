package typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import typingsJapgolly.angular.JQuery
import typingsJapgolly.angular.mod.IPromise
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.angular.mod.Injectable
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type IColorExpression = StringDictionary[String]

type IIcon = js.Function1[/* id */ String, IPromise[Element]]

type IMedia = js.Function1[/* media */ String, Boolean]

type IStickyService = js.Function3[/* scope */ IScope, /* element */ JQuery, /* elementClone */ js.UndefOr[JQuery], Unit]

type ResolveObject = StringDictionary[Injectable[js.Function1[/* repeated */ Any, PromiseLike[Any]]]]
