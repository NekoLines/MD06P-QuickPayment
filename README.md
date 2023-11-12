# MD06P-QuickPayment

*除中文外，英语和日语都是机械翻译，请谅解。/Except for Chinese, both English and Japanese are machine-translated. Please understand./中国語以外は、英語と日本語は機械翻訳されています。ご理解いただければ幸いです。*

该软件是设计给Mode1 Retro2（MD06P）的，该软件可以让用户快捷的使用数字键跳转到支付宝的付款码，扫码以及微信的扫码界面。这个软件仅为md06p设计，别的设备使用可能存在其他的问题。欢迎提出issue和修改建议!

Quick Payment app tailored for Mode1 Retro2 (MD06P). Enables users to swiftly navigate to Alipay payment code, scan QR codes, and access WeChat's scan interface using numeric keys. Designed exclusively for MD06P; compatibility issues may arise with other devices. Welcome to raise issues and suggest modifications.

このソフトウェアは、Mode1 Retro2（MD06P）向けに特別に設計されています。ユーザーは数字キーを使用して、迅速にAlipayの支払いコードに移動したり、QRコードをスキャンしたり、WeChatのスキャンインターフェースにアクセスしたりできます。このアプリケーションはMD06P専用に設計されており、他のデバイスとの使用時に互換性の問題が発生する可能性があります。ご意見、問題の報告、修正提案をお待ちしております！

## 工作原理/Working Principle/動作原理

该程序本质上就是三个按键事件的接收器，MD06P比较特殊，可以设置四个快捷键，但是快捷键只能设置为APP，为了方便平时付款就设计了这款APP，打开后可以使用1，2，3三个按键切换到支付宝，微信等软件的付款界面。实际上本软件可以开启其他任意软件，只要能调用起来就可以。
如果修改的话想必也很简单，就不多写了。

This program essentially serves as a receiver for three key events. MD06P, being unique, allows for the configuration of four shortcuts, limited to launching apps. To facilitate convenient payments, this app was designed. Upon opening, users can use the keys 1, 2, and 3 to toggle between payment interfaces of apps like Alipay and WeChat. In reality, this software can open any app, as long as it can be invoked. Modification should be straightforward.

このプログラムは基本的に、3つのキーイベントの受信機として機能します。MD06Pは特殊で、4つのショートカットを設定できますが、これはアプリの起動に制限されています。支払いを便利にするために、このアプリが設計されました。起動時にユーザーは1、2、3のキーを使用して、AlipayやWeChatなどのアプリの支払いインターフェースを切り替えることができます。実際には、このソフトウェアは起動できるアプリならどんなアプリでも起動できます。変更は簡単でしょう。

## 语言支持/Language Support/言語サポート

本软件支持中/英/日语

This software supports Chinese, English, and Japanese.

このソフトウェアは中国語、英語、日本語をサポートしています。

## 环境需求/System Requirements/システム要件

本软件只能在安卓13上运行，理论上修改编译文件可以让程序在更低版本上运行，但是设备没有更低版本就使用了省事的设计。
程序只测试了MD06P，其他设备因为分辨率不同可能会出现严重的故障（程序里写死了分辨率）。如有更好的方案欢迎提交修改。

The software is designed to run on Android 13. Theoretically, modifying compilation files may allow the program to run on lower versions, but this hasn't been tested due to the absence of devices with lower versions. The program has only been tested on MD06P; other devices may experience severe issues due to different resolutions (the program has resolution hardcoded). Feel free to submit modifications for a better solution.

このソフトウェアはAndroid 13で動作するように設計されています。理論的には、コンパイルファイルの変更により、プログラムを低いバージョンで実行できるかもしれませんが、低いバージョンのデバイスがないためテストされていません。プログラムはMD06Pでのみテストされています。他のデバイスは異なる解像度のため、深刻な問題が発生する可能性があります（プログラムには解像度がハードコーディングされています）。より良い解決策があれば、修正の提出を歓迎します。
