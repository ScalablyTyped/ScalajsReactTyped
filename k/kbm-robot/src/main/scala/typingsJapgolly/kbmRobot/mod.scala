package typingsJapgolly.kbmRobot

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.kbmRobot.kbmRobotInts.`6`
import typingsJapgolly.kbmRobot.kbmRobotInts.`7`
import typingsJapgolly.kbmRobot.kbmRobotStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("kbm-robot", JSImport.Namespace)
  @js.native
  val ^ : KBMRobot = js.native
  
  @js.native
  trait KBMRobot extends StObject {
    
    def go(): js.Promise[Unit] = js.native
    
    def mouseClick(button: MouseButton): KBMRobot = js.native
    def mouseClick(button: MouseButton, delay: Double): KBMRobot = js.native
    
    def mouseMove(x: Double, y: Double): KBMRobot = js.native
    
    def mousePress(button: MouseButton): KBMRobot = js.native
    
    def mouseRelease(button: MouseButton): KBMRobot = js.native
    
    def mouseScroll(amount: Double): KBMRobot = js.native
    
    def press(key: Key): KBMRobot = js.native
    
    def release(key: Key): KBMRobot = js.native
    
    def sleep(ms: Double): KBMRobot = js.native
    
    def startJar(): Unit = js.native
    def startJar(jre_version: `6` | `7`): Unit = js.native
    
    def stopJar(): Unit = js.native
    
    def `type`(key: Key): KBMRobot = js.native
    def `type`(key: Key, delay: Double): KBMRobot = js.native
    
    def typeString(): KBMRobot = js.native
    def typeString(str: String): KBMRobot = js.native
    def typeString(str: String, downDelay: Double): KBMRobot = js.native
    def typeString(str: String, downDelay: Double, upDelay: Double): KBMRobot = js.native
    def typeString(str: String, downDelay: Unit, upDelay: Double): KBMRobot = js.native
    def typeString(str: Unit, downDelay: Double): KBMRobot = js.native
    def typeString(str: Unit, downDelay: Double, upDelay: Double): KBMRobot = js.native
    def typeString(str: Unit, downDelay: Unit, upDelay: Double): KBMRobot = js.native
  }
  
  object Key {
    
    inline def ALT: typingsJapgolly.kbmRobot.kbmRobotStrings.ALT = "ALT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.ALT]
    
    inline def Apostrophe: /* ' */ String = "'".asInstanceOf[/* ' */ String]
    
    inline def BACKSPACE: typingsJapgolly.kbmRobot.kbmRobotStrings.BACKSPACE = "BACKSPACE".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.BACKSPACE]
    
    inline def Backslash: /* \ */ String = "\\".asInstanceOf[/* \ */ String]
    
    inline def CAPS_LOCK: typingsJapgolly.kbmRobot.kbmRobotStrings.CAPS_LOCK = "CAPS_LOCK".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.CAPS_LOCK]
    
    inline def CTRL: typingsJapgolly.kbmRobot.kbmRobotStrings.CTRL = "CTRL".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.CTRL]
    
    inline def Comma: typingsJapgolly.kbmRobot.kbmRobotStrings.Comma = ",".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.Comma]
    
    inline def DELETE: typingsJapgolly.kbmRobot.kbmRobotStrings.DELETE = "DELETE".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.DELETE]
    
    inline def DOWN: typingsJapgolly.kbmRobot.kbmRobotStrings.DOWN = "DOWN".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.DOWN]
    
    inline def Dot: typingsJapgolly.kbmRobot.kbmRobotStrings.Dot = ".".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.Dot]
    
    inline def END: typingsJapgolly.kbmRobot.kbmRobotStrings.END = "END".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.END]
    
    inline def ENTER: typingsJapgolly.kbmRobot.kbmRobotStrings.ENTER = "ENTER".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.ENTER]
    
    inline def ESC: typingsJapgolly.kbmRobot.kbmRobotStrings.ESC = "ESC".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.ESC]
    
    inline def Equalssign: typingsJapgolly.kbmRobot.kbmRobotStrings.Equalssign = "=".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.Equalssign]
    
    inline def F1: typingsJapgolly.kbmRobot.kbmRobotStrings.F1 = "F1".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.F1]
    
    inline def F10: typingsJapgolly.kbmRobot.kbmRobotStrings.F10 = "F10".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.F10]
    
    inline def F11: typingsJapgolly.kbmRobot.kbmRobotStrings.F11 = "F11".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.F11]
    
    inline def F12: typingsJapgolly.kbmRobot.kbmRobotStrings.F12 = "F12".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.F12]
    
    inline def F2: typingsJapgolly.kbmRobot.kbmRobotStrings.F2 = "F2".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.F2]
    
    inline def F3: typingsJapgolly.kbmRobot.kbmRobotStrings.F3 = "F3".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.F3]
    
    inline def F4: typingsJapgolly.kbmRobot.kbmRobotStrings.F4 = "F4".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.F4]
    
    inline def F5: typingsJapgolly.kbmRobot.kbmRobotStrings.F5 = "F5".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.F5]
    
    inline def F6: typingsJapgolly.kbmRobot.kbmRobotStrings.F6 = "F6".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.F6]
    
    inline def F7: typingsJapgolly.kbmRobot.kbmRobotStrings.F7 = "F7".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.F7]
    
    inline def F8: typingsJapgolly.kbmRobot.kbmRobotStrings.F8 = "F8".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.F8]
    
    inline def F9: typingsJapgolly.kbmRobot.kbmRobotStrings.F9 = "F9".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.F9]
    
    inline def Graveaccent: typingsJapgolly.kbmRobot.kbmRobotStrings.Graveaccent = "`".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.Graveaccent]
    
    inline def HOME: typingsJapgolly.kbmRobot.kbmRobotStrings.HOME = "HOME".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.HOME]
    
    inline def INSERT: typingsJapgolly.kbmRobot.kbmRobotStrings.INSERT = "INSERT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.INSERT]
    
    inline def `KP_-`: typingsJapgolly.kbmRobot.kbmRobotStrings.`KP_-` = "KP_-".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.`KP_-`]
    
    inline def KP_0: typingsJapgolly.kbmRobot.kbmRobotStrings.KP_0 = "KP_0".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.KP_0]
    
    inline def KP_1: typingsJapgolly.kbmRobot.kbmRobotStrings.KP_1 = "KP_1".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.KP_1]
    
    inline def KP_2: typingsJapgolly.kbmRobot.kbmRobotStrings.KP_2 = "KP_2".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.KP_2]
    
    inline def KP_3: typingsJapgolly.kbmRobot.kbmRobotStrings.KP_3 = "KP_3".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.KP_3]
    
    inline def KP_4: typingsJapgolly.kbmRobot.kbmRobotStrings.KP_4 = "KP_4".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.KP_4]
    
    inline def KP_5: typingsJapgolly.kbmRobot.kbmRobotStrings.KP_5 = "KP_5".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.KP_5]
    
    inline def KP_6: typingsJapgolly.kbmRobot.kbmRobotStrings.KP_6 = "KP_6".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.KP_6]
    
    inline def KP_7: typingsJapgolly.kbmRobot.kbmRobotStrings.KP_7 = "KP_7".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.KP_7]
    
    inline def KP_8: typingsJapgolly.kbmRobot.kbmRobotStrings.KP_8 = "KP_8".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.KP_8]
    
    inline def KP_9: typingsJapgolly.kbmRobot.kbmRobotStrings.KP_9 = "KP_9".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.KP_9]
    
    inline def KP_ADD: typingsJapgolly.kbmRobot.kbmRobotStrings.KP_ADD = "KP_ADD".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.KP_ADD]
    
    inline def KP_Asterisk: typingsJapgolly.kbmRobot.kbmRobotStrings.KP_Asterisk = "KP_*".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.KP_Asterisk]
    
    inline def KP_Dot: typingsJapgolly.kbmRobot.kbmRobotStrings.KP_Dot = "KP_.".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.KP_Dot]
    
    inline def KP_Slash: typingsJapgolly.kbmRobot.kbmRobotStrings.KP_Slash = "KP_/".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.KP_Slash]
    
    inline def LEFT: typingsJapgolly.kbmRobot.kbmRobotStrings.LEFT = "LEFT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.LEFT]
    
    inline def Linefeed: typingsJapgolly.kbmRobot.kbmRobotStrings.Linefeed = "\n".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.Linefeed]
    
    inline def META: typingsJapgolly.kbmRobot.kbmRobotStrings.META = "META".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.META]
    
    inline def NUM_LOCK: typingsJapgolly.kbmRobot.kbmRobotStrings.NUM_LOCK = "NUM_LOCK".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.NUM_LOCK]
    
    inline def PAGE_DOWN: typingsJapgolly.kbmRobot.kbmRobotStrings.PAGE_DOWN = "PAGE_DOWN".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.PAGE_DOWN]
    
    inline def PAGE_UP: typingsJapgolly.kbmRobot.kbmRobotStrings.PAGE_UP = "PAGE_UP".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.PAGE_UP]
    
    inline def PAUSE_BREAK: typingsJapgolly.kbmRobot.kbmRobotStrings.PAUSE_BREAK = "PAUSE_BREAK".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.PAUSE_BREAK]
    
    inline def PRINT_SCREEN: typingsJapgolly.kbmRobot.kbmRobotStrings.PRINT_SCREEN = "PRINT_SCREEN".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.PRINT_SCREEN]
    
    inline def RIGHT: typingsJapgolly.kbmRobot.kbmRobotStrings.RIGHT = "RIGHT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.RIGHT]
    
    inline def SCROLL_LOCK: typingsJapgolly.kbmRobot.kbmRobotStrings.SCROLL_LOCK = "SCROLL_LOCK".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.SCROLL_LOCK]
    
    inline def SHIFT: typingsJapgolly.kbmRobot.kbmRobotStrings.SHIFT = "SHIFT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.SHIFT]
    
    inline def SPACE: typingsJapgolly.kbmRobot.kbmRobotStrings.SPACE = "SPACE".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.SPACE]
    
    inline def SUPER: typingsJapgolly.kbmRobot.kbmRobotStrings.SUPER = "SUPER".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.SUPER]
    
    inline def Semicolon: typingsJapgolly.kbmRobot.kbmRobotStrings.Semicolon = ";".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.Semicolon]
    
    inline def Slash: typingsJapgolly.kbmRobot.kbmRobotStrings.Slash = "/".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.Slash]
    
    inline def Space: typingsJapgolly.kbmRobot.kbmRobotStrings.Space = (" ").asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.Space]
    
    inline def TAB: typingsJapgolly.kbmRobot.kbmRobotStrings.TAB = "TAB".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.TAB]
    
    inline def UP: typingsJapgolly.kbmRobot.kbmRobotStrings.UP = "UP".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.UP]
    
    inline def VK_0: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_0 = "VK_0".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_0]
    
    inline def VK_1: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_1 = "VK_1".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_1]
    
    inline def VK_2: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_2 = "VK_2".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_2]
    
    inline def VK_3: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_3 = "VK_3".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_3]
    
    inline def VK_4: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_4 = "VK_4".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_4]
    
    inline def VK_5: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_5 = "VK_5".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_5]
    
    inline def VK_6: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_6 = "VK_6".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_6]
    
    inline def VK_7: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_7 = "VK_7".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_7]
    
    inline def VK_8: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_8 = "VK_8".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_8]
    
    inline def VK_9: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_9 = "VK_9".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_9]
    
    inline def VK_A: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_A = "VK_A".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_A]
    
    inline def VK_ACCEPT: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ACCEPT = "VK_ACCEPT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ACCEPT]
    
    inline def VK_ADD: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ADD = "VK_ADD".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ADD]
    
    inline def VK_AGAIN: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_AGAIN = "VK_AGAIN".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_AGAIN]
    
    inline def VK_ALL_CANDIDATES: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ALL_CANDIDATES = "VK_ALL_CANDIDATES".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ALL_CANDIDATES]
    
    inline def VK_ALPHANUMERIC: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ALPHANUMERIC = "VK_ALPHANUMERIC".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ALPHANUMERIC]
    
    inline def VK_ALT: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ALT = "VK_ALT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ALT]
    
    inline def VK_ALT_GRAPH: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ALT_GRAPH = "VK_ALT_GRAPH".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ALT_GRAPH]
    
    inline def VK_AMPERSAND: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_AMPERSAND = "VK_AMPERSAND".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_AMPERSAND]
    
    inline def VK_ASTERISK: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ASTERISK = "VK_ASTERISK".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ASTERISK]
    
    inline def VK_AT: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_AT = "VK_AT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_AT]
    
    inline def VK_B: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_B = "VK_B".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_B]
    
    inline def VK_BACK_QUOTE: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_BACK_QUOTE = "VK_BACK_QUOTE".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_BACK_QUOTE]
    
    inline def VK_BACK_SLASH: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_BACK_SLASH = "VK_BACK_SLASH".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_BACK_SLASH]
    
    inline def VK_BACK_SPACE: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_BACK_SPACE = "VK_BACK_SPACE".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_BACK_SPACE]
    
    inline def VK_BEGIN: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_BEGIN = "VK_BEGIN".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_BEGIN]
    
    inline def VK_BRACELEFT: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_BRACELEFT = "VK_BRACELEFT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_BRACELEFT]
    
    inline def VK_BRACERIGHT: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_BRACERIGHT = "VK_BRACERIGHT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_BRACERIGHT]
    
    inline def VK_C: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_C = "VK_C".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_C]
    
    inline def VK_CANCEL: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CANCEL = "VK_CANCEL".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CANCEL]
    
    inline def VK_CAPS_LOCK: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CAPS_LOCK = "VK_CAPS_LOCK".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CAPS_LOCK]
    
    inline def VK_CIRCUMFLEX: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CIRCUMFLEX = "VK_CIRCUMFLEX".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CIRCUMFLEX]
    
    inline def VK_CLEAR: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CLEAR = "VK_CLEAR".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CLEAR]
    
    inline def VK_CLOSE_BRACKET: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CLOSE_BRACKET = "VK_CLOSE_BRACKET".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CLOSE_BRACKET]
    
    inline def VK_CODE_INPUT: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CODE_INPUT = "VK_CODE_INPUT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CODE_INPUT]
    
    inline def VK_COLON: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_COLON = "VK_COLON".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_COLON]
    
    inline def VK_COMMA: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_COMMA = "VK_COMMA".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_COMMA]
    
    inline def VK_COMPOSE: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_COMPOSE = "VK_COMPOSE".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_COMPOSE]
    
    inline def VK_CONTEXT_MENU: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CONTEXT_MENU = "VK_CONTEXT_MENU".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CONTEXT_MENU]
    
    inline def VK_CONTROL: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CONTROL = "VK_CONTROL".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CONTROL]
    
    inline def VK_CONVERT: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CONVERT = "VK_CONVERT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CONVERT]
    
    inline def VK_COPY: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_COPY = "VK_COPY".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_COPY]
    
    inline def VK_CUT: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CUT = "VK_CUT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CUT]
    
    inline def VK_D: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_D = "VK_D".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_D]
    
    inline def VK_DEAD_ABOVEDOT: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_ABOVEDOT = "VK_DEAD_ABOVEDOT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_ABOVEDOT]
    
    inline def VK_DEAD_ABOVERING: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_ABOVERING = "VK_DEAD_ABOVERING".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_ABOVERING]
    
    inline def VK_DEAD_ACUTE: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_ACUTE = "VK_DEAD_ACUTE".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_ACUTE]
    
    inline def VK_DEAD_BREVE: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_BREVE = "VK_DEAD_BREVE".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_BREVE]
    
    inline def VK_DEAD_CARON: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_CARON = "VK_DEAD_CARON".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_CARON]
    
    inline def VK_DEAD_CEDILLA: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_CEDILLA = "VK_DEAD_CEDILLA".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_CEDILLA]
    
    inline def VK_DEAD_CIRCUMFLEX: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_CIRCUMFLEX = "VK_DEAD_CIRCUMFLEX".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_CIRCUMFLEX]
    
    inline def VK_DEAD_DIAERESIS: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_DIAERESIS = "VK_DEAD_DIAERESIS".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_DIAERESIS]
    
    inline def VK_DEAD_DOUBLEACUTE: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_DOUBLEACUTE = "VK_DEAD_DOUBLEACUTE".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_DOUBLEACUTE]
    
    inline def VK_DEAD_GRAVE: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_GRAVE = "VK_DEAD_GRAVE".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_GRAVE]
    
    inline def VK_DEAD_IOTA: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_IOTA = "VK_DEAD_IOTA".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_IOTA]
    
    inline def VK_DEAD_MACRON: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_MACRON = "VK_DEAD_MACRON".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_MACRON]
    
    inline def VK_DEAD_OGONEK: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_OGONEK = "VK_DEAD_OGONEK".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_OGONEK]
    
    inline def VK_DEAD_SEMIVOICED_SOUND: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_SEMIVOICED_SOUND = "VK_DEAD_SEMIVOICED_SOUND".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_SEMIVOICED_SOUND]
    
    inline def VK_DEAD_TILDE: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_TILDE = "VK_DEAD_TILDE".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_TILDE]
    
    inline def VK_DEAD_VOICED_SOUND: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_VOICED_SOUND = "VK_DEAD_VOICED_SOUND".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_VOICED_SOUND]
    
    inline def VK_DECIMAL: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DECIMAL = "VK_DECIMAL".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DECIMAL]
    
    inline def VK_DELETE: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DELETE = "VK_DELETE".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DELETE]
    
    inline def VK_DIVIDE: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DIVIDE = "VK_DIVIDE".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DIVIDE]
    
    inline def VK_DOLLAR: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DOLLAR = "VK_DOLLAR".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DOLLAR]
    
    inline def VK_DOWN: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DOWN = "VK_DOWN".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DOWN]
    
    inline def VK_E: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_E = "VK_E".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_E]
    
    inline def VK_END: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_END = "VK_END".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_END]
    
    inline def VK_ENTER: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ENTER = "VK_ENTER".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ENTER]
    
    inline def VK_EQUALS: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_EQUALS = "VK_EQUALS".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_EQUALS]
    
    inline def VK_ESCAPE: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ESCAPE = "VK_ESCAPE".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ESCAPE]
    
    inline def VK_EURO_SIGN: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_EURO_SIGN = "VK_EURO_SIGN".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_EURO_SIGN]
    
    inline def VK_EXCLAMATION_MARK: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_EXCLAMATION_MARK = "VK_EXCLAMATION_MARK".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_EXCLAMATION_MARK]
    
    inline def VK_F: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F = "VK_F".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F]
    
    inline def VK_F1: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F1 = "VK_F1".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F1]
    
    inline def VK_F10: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F10 = "VK_F10".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F10]
    
    inline def VK_F11: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F11 = "VK_F11".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F11]
    
    inline def VK_F12: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F12 = "VK_F12".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F12]
    
    inline def VK_F13: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F13 = "VK_F13".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F13]
    
    inline def VK_F14: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F14 = "VK_F14".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F14]
    
    inline def VK_F15: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F15 = "VK_F15".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F15]
    
    inline def VK_F16: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F16 = "VK_F16".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F16]
    
    inline def VK_F17: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F17 = "VK_F17".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F17]
    
    inline def VK_F18: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F18 = "VK_F18".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F18]
    
    inline def VK_F19: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F19 = "VK_F19".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F19]
    
    inline def VK_F2: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F2 = "VK_F2".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F2]
    
    inline def VK_F20: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F20 = "VK_F20".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F20]
    
    inline def VK_F21: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F21 = "VK_F21".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F21]
    
    inline def VK_F22: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F22 = "VK_F22".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F22]
    
    inline def VK_F23: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F23 = "VK_F23".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F23]
    
    inline def VK_F24: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F24 = "VK_F24".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F24]
    
    inline def VK_F3: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F3 = "VK_F3".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F3]
    
    inline def VK_F4: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F4 = "VK_F4".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F4]
    
    inline def VK_F5: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F5 = "VK_F5".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F5]
    
    inline def VK_F6: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F6 = "VK_F6".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F6]
    
    inline def VK_F7: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F7 = "VK_F7".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F7]
    
    inline def VK_F8: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F8 = "VK_F8".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F8]
    
    inline def VK_F9: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F9 = "VK_F9".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F9]
    
    inline def VK_FINAL: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_FINAL = "VK_FINAL".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_FINAL]
    
    inline def VK_FIND: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_FIND = "VK_FIND".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_FIND]
    
    inline def VK_FULL_WIDTH: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_FULL_WIDTH = "VK_FULL_WIDTH".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_FULL_WIDTH]
    
    inline def VK_G: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_G = "VK_G".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_G]
    
    inline def VK_GREATER: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_GREATER = "VK_GREATER".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_GREATER]
    
    inline def VK_H: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_H = "VK_H".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_H]
    
    inline def VK_HALF_WIDTH: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_HALF_WIDTH = "VK_HALF_WIDTH".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_HALF_WIDTH]
    
    inline def VK_HELP: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_HELP = "VK_HELP".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_HELP]
    
    inline def VK_HIRAGANA: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_HIRAGANA = "VK_HIRAGANA".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_HIRAGANA]
    
    inline def VK_HOME: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_HOME = "VK_HOME".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_HOME]
    
    inline def VK_I: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_I = "VK_I".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_I]
    
    inline def VK_INPUT_METHOD_ON_OFF: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_INPUT_METHOD_ON_OFF = "VK_INPUT_METHOD_ON_OFF".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_INPUT_METHOD_ON_OFF]
    
    inline def VK_INSERT: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_INSERT = "VK_INSERT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_INSERT]
    
    inline def VK_INVERTED_EXCLAMATION_MARK: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_INVERTED_EXCLAMATION_MARK = "VK_INVERTED_EXCLAMATION_MARK".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_INVERTED_EXCLAMATION_MARK]
    
    inline def VK_J: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_J = "VK_J".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_J]
    
    inline def VK_JAPANESE_HIRAGANA: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_JAPANESE_HIRAGANA = "VK_JAPANESE_HIRAGANA".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_JAPANESE_HIRAGANA]
    
    inline def VK_JAPANESE_KATAKANA: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_JAPANESE_KATAKANA = "VK_JAPANESE_KATAKANA".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_JAPANESE_KATAKANA]
    
    inline def VK_JAPANESE_ROMAN: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_JAPANESE_ROMAN = "VK_JAPANESE_ROMAN".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_JAPANESE_ROMAN]
    
    inline def VK_K: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_K = "VK_K".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_K]
    
    inline def VK_KANA: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KANA = "VK_KANA".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KANA]
    
    inline def VK_KANA_LOCK: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KANA_LOCK = "VK_KANA_LOCK".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KANA_LOCK]
    
    inline def VK_KANJI: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KANJI = "VK_KANJI".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KANJI]
    
    inline def VK_KATAKANA: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KATAKANA = "VK_KATAKANA".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KATAKANA]
    
    inline def VK_KP_DOWN: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KP_DOWN = "VK_KP_DOWN".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KP_DOWN]
    
    inline def VK_KP_LEFT: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KP_LEFT = "VK_KP_LEFT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KP_LEFT]
    
    inline def VK_KP_RIGHT: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KP_RIGHT = "VK_KP_RIGHT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KP_RIGHT]
    
    inline def VK_KP_UP: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KP_UP = "VK_KP_UP".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KP_UP]
    
    inline def VK_L: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_L = "VK_L".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_L]
    
    inline def VK_LEFT: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_LEFT = "VK_LEFT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_LEFT]
    
    inline def VK_LEFT_PARENTHESIS: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_LEFT_PARENTHESIS = "VK_LEFT_PARENTHESIS".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_LEFT_PARENTHESIS]
    
    inline def VK_LESS: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_LESS = "VK_LESS".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_LESS]
    
    inline def VK_M: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_M = "VK_M".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_M]
    
    inline def VK_META: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_META = "VK_META".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_META]
    
    inline def VK_MINUS: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_MINUS = "VK_MINUS".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_MINUS]
    
    inline def VK_MODECHANGE: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_MODECHANGE = "VK_MODECHANGE".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_MODECHANGE]
    
    inline def VK_MULTIPLY: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_MULTIPLY = "VK_MULTIPLY".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_MULTIPLY]
    
    inline def VK_N: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_N = "VK_N".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_N]
    
    inline def VK_NONCONVERT: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NONCONVERT = "VK_NONCONVERT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NONCONVERT]
    
    inline def VK_NUMBER_SIGN: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMBER_SIGN = "VK_NUMBER_SIGN".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMBER_SIGN]
    
    inline def VK_NUMPAD0: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD0 = "VK_NUMPAD0".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD0]
    
    inline def VK_NUMPAD1: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD1 = "VK_NUMPAD1".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD1]
    
    inline def VK_NUMPAD2: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD2 = "VK_NUMPAD2".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD2]
    
    inline def VK_NUMPAD3: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD3 = "VK_NUMPAD3".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD3]
    
    inline def VK_NUMPAD4: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD4 = "VK_NUMPAD4".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD4]
    
    inline def VK_NUMPAD5: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD5 = "VK_NUMPAD5".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD5]
    
    inline def VK_NUMPAD6: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD6 = "VK_NUMPAD6".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD6]
    
    inline def VK_NUMPAD7: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD7 = "VK_NUMPAD7".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD7]
    
    inline def VK_NUMPAD8: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD8 = "VK_NUMPAD8".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD8]
    
    inline def VK_NUMPAD9: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD9 = "VK_NUMPAD9".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD9]
    
    inline def VK_NUM_LOCK: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUM_LOCK = "VK_NUM_LOCK".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUM_LOCK]
    
    inline def VK_O: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_O = "VK_O".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_O]
    
    inline def VK_OPEN_BRACKET: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_OPEN_BRACKET = "VK_OPEN_BRACKET".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_OPEN_BRACKET]
    
    inline def VK_P: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_P = "VK_P".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_P]
    
    inline def VK_PAGE_DOWN: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PAGE_DOWN = "VK_PAGE_DOWN".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PAGE_DOWN]
    
    inline def VK_PAGE_UP: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PAGE_UP = "VK_PAGE_UP".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PAGE_UP]
    
    inline def VK_PASTE: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PASTE = "VK_PASTE".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PASTE]
    
    inline def VK_PAUSE: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PAUSE = "VK_PAUSE".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PAUSE]
    
    inline def VK_PERIOD: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PERIOD = "VK_PERIOD".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PERIOD]
    
    inline def VK_PLUS: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PLUS = "VK_PLUS".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PLUS]
    
    inline def VK_PREVIOUS_CANDIDATE: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PREVIOUS_CANDIDATE = "VK_PREVIOUS_CANDIDATE".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PREVIOUS_CANDIDATE]
    
    inline def VK_PRINTSCREEN: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PRINTSCREEN = "VK_PRINTSCREEN".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PRINTSCREEN]
    
    inline def VK_PROPS: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PROPS = "VK_PROPS".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PROPS]
    
    inline def VK_Q: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_Q = "VK_Q".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_Q]
    
    inline def VK_QUOTE: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_QUOTE = "VK_QUOTE".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_QUOTE]
    
    inline def VK_QUOTEDBL: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_QUOTEDBL = "VK_QUOTEDBL".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_QUOTEDBL]
    
    inline def VK_R: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_R = "VK_R".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_R]
    
    inline def VK_RIGHT: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_RIGHT = "VK_RIGHT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_RIGHT]
    
    inline def VK_RIGHT_PARENTHESIS: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_RIGHT_PARENTHESIS = "VK_RIGHT_PARENTHESIS".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_RIGHT_PARENTHESIS]
    
    inline def VK_ROMAN_CHARACTERS: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ROMAN_CHARACTERS = "VK_ROMAN_CHARACTERS".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ROMAN_CHARACTERS]
    
    inline def VK_S: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_S = "VK_S".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_S]
    
    inline def VK_SCROLL_LOCK: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SCROLL_LOCK = "VK_SCROLL_LOCK".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SCROLL_LOCK]
    
    inline def VK_SEMICOLON: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SEMICOLON = "VK_SEMICOLON".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SEMICOLON]
    
    inline def VK_SEPARATER: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SEPARATER = "VK_SEPARATER".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SEPARATER]
    
    inline def VK_SEPARATOR: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SEPARATOR = "VK_SEPARATOR".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SEPARATOR]
    
    inline def VK_SHIFT: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SHIFT = "VK_SHIFT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SHIFT]
    
    inline def VK_SLASH: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SLASH = "VK_SLASH".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SLASH]
    
    inline def VK_SPACE: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SPACE = "VK_SPACE".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SPACE]
    
    inline def VK_STOP: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_STOP = "VK_STOP".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_STOP]
    
    inline def VK_SUBTRACT: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SUBTRACT = "VK_SUBTRACT".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SUBTRACT]
    
    inline def VK_T: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_T = "VK_T".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_T]
    
    inline def VK_TAB: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_TAB = "VK_TAB".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_TAB]
    
    inline def VK_U: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_U = "VK_U".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_U]
    
    inline def VK_UNDEFINED: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_UNDEFINED = "VK_UNDEFINED".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_UNDEFINED]
    
    inline def VK_UNDERSCORE: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_UNDERSCORE = "VK_UNDERSCORE".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_UNDERSCORE]
    
    inline def VK_UNDO: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_UNDO = "VK_UNDO".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_UNDO]
    
    inline def VK_UP: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_UP = "VK_UP".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_UP]
    
    inline def VK_V: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_V = "VK_V".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_V]
    
    inline def VK_W: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_W = "VK_W".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_W]
    
    inline def VK_WINDOWS: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_WINDOWS = "VK_WINDOWS".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_WINDOWS]
    
    inline def VK_X: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_X = "VK_X".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_X]
    
    inline def VK_Y: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_Y = "VK_Y".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_Y]
    
    inline def VK_Z: typingsJapgolly.kbmRobot.kbmRobotStrings.VK_Z = "VK_Z".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.VK_Z]
    
    inline def `[`: typingsJapgolly.kbmRobot.kbmRobotStrings.`[` = "[".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.`[`]
    
    inline def `]`: typingsJapgolly.kbmRobot.kbmRobotStrings.`]` = "]".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.`]`]
    
    inline def _dash: `-_` = "-".asInstanceOf[`-_`]
  }
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ENTER
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_BACK_SPACE
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_TAB
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CANCEL
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CLEAR
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SHIFT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CONTROL
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ALT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PAUSE
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CAPS_LOCK
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ESCAPE
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SPACE
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PAGE_UP
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PAGE_DOWN
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_END
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_HOME
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_LEFT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_UP
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_RIGHT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DOWN
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_COMMA
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_MINUS
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PERIOD
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SLASH
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_0
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_1
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_2
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_3
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_4
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_5
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_6
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_7
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_8
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_9
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SEMICOLON
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_EQUALS
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_A
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_B
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_C
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_D
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_E
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_G
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_H
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_I
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_J
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_K
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_L
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_M
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_N
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_O
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_P
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_Q
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_R
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_S
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_T
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_U
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_V
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_W
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_X
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_Y
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_Z
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_OPEN_BRACKET
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_BACK_SLASH
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CLOSE_BRACKET
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD0
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD1
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD2
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD3
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD4
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD5
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD6
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD7
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD8
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMPAD9
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_MULTIPLY
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ADD
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SEPARATER
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SEPARATOR
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SUBTRACT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DECIMAL
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DIVIDE
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DELETE
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUM_LOCK
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_SCROLL_LOCK
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F1
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F2
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F3
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F4
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F5
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F6
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F7
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F8
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F9
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F10
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F11
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F12
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F13
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F14
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F15
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F16
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F17
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F18
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F19
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F20
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F21
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F22
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F23
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_F24
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PRINTSCREEN
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_INSERT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_HELP
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_META
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_BACK_QUOTE
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_QUOTE
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KP_UP
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KP_DOWN
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KP_LEFT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KP_RIGHT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_GRAVE
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_ACUTE
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_CIRCUMFLEX
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_TILDE
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_MACRON
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_BREVE
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_ABOVEDOT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_DIAERESIS
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_ABOVERING
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_DOUBLEACUTE
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_CARON
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_CEDILLA
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_OGONEK
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_IOTA
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_VOICED_SOUND
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DEAD_SEMIVOICED_SOUND
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_AMPERSAND
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ASTERISK
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_QUOTEDBL
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_LESS
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_GREATER
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_BRACELEFT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_BRACERIGHT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_AT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_COLON
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CIRCUMFLEX
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_DOLLAR
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_EURO_SIGN
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_EXCLAMATION_MARK
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_INVERTED_EXCLAMATION_MARK
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_LEFT_PARENTHESIS
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NUMBER_SIGN
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PLUS
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_RIGHT_PARENTHESIS
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_UNDERSCORE
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_WINDOWS
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CONTEXT_MENU
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_FINAL
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CONVERT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_NONCONVERT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ACCEPT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_MODECHANGE
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KANA
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KANJI
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ALPHANUMERIC
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KATAKANA
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_HIRAGANA
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_FULL_WIDTH
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_HALF_WIDTH
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ROMAN_CHARACTERS
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ALL_CANDIDATES
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PREVIOUS_CANDIDATE
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CODE_INPUT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_JAPANESE_KATAKANA
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_JAPANESE_HIRAGANA
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_JAPANESE_ROMAN
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_KANA_LOCK
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_INPUT_METHOD_ON_OFF
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_CUT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_COPY
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PASTE
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_UNDO
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_AGAIN
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_FIND
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_PROPS
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_STOP
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_COMPOSE
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_ALT_GRAPH
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_BEGIN
    - typingsJapgolly.kbmRobot.kbmRobotStrings.VK_UNDEFINED
    - typingsJapgolly.kbmRobot.kbmRobotStrings.ESC
    - typingsJapgolly.kbmRobot.kbmRobotStrings.F1
    - typingsJapgolly.kbmRobot.kbmRobotStrings.F2
    - typingsJapgolly.kbmRobot.kbmRobotStrings.F3
    - typingsJapgolly.kbmRobot.kbmRobotStrings.F4
    - typingsJapgolly.kbmRobot.kbmRobotStrings.F5
    - typingsJapgolly.kbmRobot.kbmRobotStrings.F6
    - typingsJapgolly.kbmRobot.kbmRobotStrings.F7
    - typingsJapgolly.kbmRobot.kbmRobotStrings.F8
    - typingsJapgolly.kbmRobot.kbmRobotStrings.F9
    - typingsJapgolly.kbmRobot.kbmRobotStrings.F10
    - typingsJapgolly.kbmRobot.kbmRobotStrings.F11
    - typingsJapgolly.kbmRobot.kbmRobotStrings.F12
    - typingsJapgolly.kbmRobot.kbmRobotStrings.CTRL
    - typingsJapgolly.kbmRobot.kbmRobotStrings.META
    - typingsJapgolly.kbmRobot.kbmRobotStrings.SUPER
    - typingsJapgolly.kbmRobot.kbmRobotStrings.ALT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.Space
    - typingsJapgolly.kbmRobot.kbmRobotStrings.SPACE
    - typingsJapgolly.kbmRobot.kbmRobotStrings.LEFT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.DOWN
    - typingsJapgolly.kbmRobot.kbmRobotStrings.RIGHT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.UP
    - typingsJapgolly.kbmRobot.kbmRobotStrings.TAB
    - typingsJapgolly.kbmRobot.kbmRobotStrings.SHIFT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.ENTER
    - typingsJapgolly.kbmRobot.kbmRobotStrings.Linefeed
    - typingsJapgolly.kbmRobot.kbmRobotStrings.CAPS_LOCK
    - typingsJapgolly.kbmRobot.kbmRobotStrings.PRINT_SCREEN
    - typingsJapgolly.kbmRobot.kbmRobotStrings.SCROLL_LOCK
    - typingsJapgolly.kbmRobot.kbmRobotStrings.PAUSE_BREAK
    - typingsJapgolly.kbmRobot.kbmRobotStrings.BACKSPACE
    - typingsJapgolly.kbmRobot.kbmRobotStrings.DELETE
    - typingsJapgolly.kbmRobot.kbmRobotStrings.HOME
    - typingsJapgolly.kbmRobot.kbmRobotStrings.END
    - typingsJapgolly.kbmRobot.kbmRobotStrings.INSERT
    - typingsJapgolly.kbmRobot.kbmRobotStrings.PAGE_UP
    - typingsJapgolly.kbmRobot.kbmRobotStrings.PAGE_DOWN
    - typingsJapgolly.kbmRobot.kbmRobotStrings.NUM_LOCK
    - typingsJapgolly.kbmRobot.kbmRobotStrings.Graveaccent
    - typingsJapgolly.kbmRobot.kbmRobotStrings.`-_`
    - typingsJapgolly.kbmRobot.kbmRobotStrings.Equalssign
    - typingsJapgolly.kbmRobot.kbmRobotStrings.`[`
    - typingsJapgolly.kbmRobot.kbmRobotStrings.`]`
    - / * \ * / java.lang.String
    - typingsJapgolly.kbmRobot.kbmRobotStrings.Semicolon
    - typingsJapgolly.kbmRobot.kbmRobotStrings.Comma
    - typingsJapgolly.kbmRobot.kbmRobotStrings.Dot
    - typingsJapgolly.kbmRobot.kbmRobotStrings.Slash
    - typingsJapgolly.kbmRobot.kbmRobotStrings.KP_ADD
    - typingsJapgolly.kbmRobot.kbmRobotStrings.`KP_-`
    - typingsJapgolly.kbmRobot.kbmRobotStrings.KP_Asterisk
    - typingsJapgolly.kbmRobot.kbmRobotStrings.KP_Slash
    - typingsJapgolly.kbmRobot.kbmRobotStrings.KP_0
    - typingsJapgolly.kbmRobot.kbmRobotStrings.KP_Dot
    - typingsJapgolly.kbmRobot.kbmRobotStrings.KP_1
    - typingsJapgolly.kbmRobot.kbmRobotStrings.KP_2
    - typingsJapgolly.kbmRobot.kbmRobotStrings.KP_3
    - typingsJapgolly.kbmRobot.kbmRobotStrings.KP_4
    - typingsJapgolly.kbmRobot.kbmRobotStrings.KP_5
    - typingsJapgolly.kbmRobot.kbmRobotStrings.KP_6
    - typingsJapgolly.kbmRobot.kbmRobotStrings.KP_7
    - typingsJapgolly.kbmRobot.kbmRobotStrings.KP_8
    - typingsJapgolly.kbmRobot.kbmRobotStrings.KP_9
  */
  type Key = _Key | (/* \ */ String)
  
  type MouseButton = _MouseButton | (/* template literal string: ${_MouseButton}${_MouseButton} */ String)
  
  trait _Key extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.kbmRobot.kbmRobotStrings.`1`
    - typingsJapgolly.kbmRobot.kbmRobotStrings.`2`
    - typingsJapgolly.kbmRobot.kbmRobotStrings.`3`
  */
  trait _MouseButton extends StObject
  object _MouseButton {
    
    inline def `1`: typingsJapgolly.kbmRobot.kbmRobotStrings.`1` = "1".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.`1`]
    
    inline def `2`: typingsJapgolly.kbmRobot.kbmRobotStrings.`2` = "2".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.`2`]
    
    inline def `3`: typingsJapgolly.kbmRobot.kbmRobotStrings.`3` = "3".asInstanceOf[typingsJapgolly.kbmRobot.kbmRobotStrings.`3`]
  }
  
  type _To = KBMRobot
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: KBMRobot = ^
}
