package typingsJapgolly.ansiFragments

import typingsJapgolly.ansiFragments.buildFragmentsColorMod.AnsiColor
import typingsJapgolly.ansiFragments.buildFragmentsColorMod.Color_
import typingsJapgolly.ansiFragments.buildFragmentsContainerMod.Container_
import typingsJapgolly.ansiFragments.buildFragmentsFixedMod.Bias
import typingsJapgolly.ansiFragments.buildFragmentsFixedMod.Fixed_
import typingsJapgolly.ansiFragments.buildFragmentsIfElseMod.Condition
import typingsJapgolly.ansiFragments.buildFragmentsIfElseMod.IfElse_
import typingsJapgolly.ansiFragments.buildFragmentsIfragmentMod.IFragment
import typingsJapgolly.ansiFragments.buildFragmentsModifierMod.AnsiModifier
import typingsJapgolly.ansiFragments.buildFragmentsModifierMod.Modifier_
import typingsJapgolly.ansiFragments.buildFragmentsPadMod.Pad_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("ansi-fragments/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def color(ansiColor: AnsiColor, children: (String | IFragment)*): Color_ = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(scala.List(ansiColor.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Color_]
  
  inline def container(children: (String | IFragment)*): Container_ = ^.asInstanceOf[js.Dynamic].applyDynamic("container")(children.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Container_]
  
  inline def fixed(value: Double, bias: Bias, children: (String | IFragment)*): Fixed_ = (^.asInstanceOf[js.Dynamic].applyDynamic("fixed")((scala.List(value.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Fixed_]
  
  inline def ifElse(condition: Condition, ifTrueFragment: String): IfElse_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(condition.asInstanceOf[js.Any], ifTrueFragment.asInstanceOf[js.Any])).asInstanceOf[IfElse_]
  inline def ifElse(condition: Condition, ifTrueFragment: String, elseFragment: String): IfElse_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(condition.asInstanceOf[js.Any], ifTrueFragment.asInstanceOf[js.Any], elseFragment.asInstanceOf[js.Any])).asInstanceOf[IfElse_]
  inline def ifElse(condition: Condition, ifTrueFragment: String, elseFragment: IFragment): IfElse_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(condition.asInstanceOf[js.Any], ifTrueFragment.asInstanceOf[js.Any], elseFragment.asInstanceOf[js.Any])).asInstanceOf[IfElse_]
  inline def ifElse(condition: Condition, ifTrueFragment: IFragment): IfElse_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(condition.asInstanceOf[js.Any], ifTrueFragment.asInstanceOf[js.Any])).asInstanceOf[IfElse_]
  inline def ifElse(condition: Condition, ifTrueFragment: IFragment, elseFragment: String): IfElse_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(condition.asInstanceOf[js.Any], ifTrueFragment.asInstanceOf[js.Any], elseFragment.asInstanceOf[js.Any])).asInstanceOf[IfElse_]
  inline def ifElse(condition: Condition, ifTrueFragment: IFragment, elseFragment: IFragment): IfElse_ = (^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(condition.asInstanceOf[js.Any], ifTrueFragment.asInstanceOf[js.Any], elseFragment.asInstanceOf[js.Any])).asInstanceOf[IfElse_]
  
  inline def modifier(ansiModifier: AnsiModifier, children: (String | IFragment)*): Modifier_ = ^.asInstanceOf[js.Dynamic].applyDynamic("modifier")(scala.List(ansiModifier.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Modifier_]
  
  inline def pad(count: Double): Pad_ = ^.asInstanceOf[js.Dynamic].applyDynamic("pad")(count.asInstanceOf[js.Any]).asInstanceOf[Pad_]
  inline def pad(count: Double, separator: String): Pad_ = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(count.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[Pad_]
}
